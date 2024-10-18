package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import modelo.dao.ClienteDao;
import modelo.entity.Cliente;

import java.util.List;

public class ClienteImpl implements ClienteDao {

    private EntityManagerFactory emf;

    public ClienteImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }



    @Override
    public List<Cliente> getAllClientes() {
        EntityManager em = emf.createEntityManager();
        List<Cliente> clientes = null;
        try {
            TypedQuery<Cliente> query = em.createQuery("from Cliente", Cliente.class);
            clientes = query.getResultList();
        } finally {
            em.close();
        }
        return clientes;
    }

    @Override
    public Cliente findClienteById(Long id) {
        EntityManager em = emf.createEntityManager();
        Cliente cliente = null;
        try {
            cliente = em.find(Cliente.class, id);
        } finally {
            em.close();
        }
        return cliente;
    }

    @Override
    public Cliente findClienteByName(String name) {
        EntityManager em = emf.createEntityManager();
        Cliente cliente = null;
        try {
            TypedQuery<Cliente> query = em.createQuery("from Cliente where nombre = :name", Cliente.class);
            query.setParameter("name", name);
            cliente = query.getSingleResult();
        } finally {
            em.close();
        }
        return cliente;
    }

    @Override
    public Cliente findClienteByEmail(String email) {
        EntityManager em = emf.createEntityManager();
        Cliente cliente = null;
        try {
            TypedQuery<Cliente> query = em.createQuery("from Cliente where correoElectronico = :email", Cliente.class);
            query.setParameter("email", email);
            cliente = query.getSingleResult();
        } finally {
            em.close();
        }
        return cliente;
    }



    @Override
    public void saveCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);  // Guardar el nuevo cliente
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();  // Revertir en caso de error
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void updateCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(cliente);  // Actualizar el cliente existente
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteClienteById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class, id);
            if (cliente != null) {
                em.remove(cliente);  // Eliminar el cliente si se encuentra
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
}
