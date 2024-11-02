package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import modelo.dao.ClienteDao;
import modelo.entity.Cliente;

import java.util.List;

/**
 * Implementación de la interfaz ClienteDao para operaciones CRUD en la entidad
 * Cliente. Utiliza JPA para manejar la persistencia de datos en una base de
 * datos.
 */
public class ClienteImpl implements ClienteDao {

    private EntityManagerFactory emf;

    public ClienteImpl() {
        this.emf = EntityManagerFactorySingleton.getInstance();
    }

    /**
     * Obtiene una lista de todos los clientes en la base de datos.
     *
     * @return Una lista de objetos Cliente.
     */
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

    /**
     * Busca un cliente en la base de datos por su ID.
     *
     * @param id El ID del cliente a buscar.
     * @return El objeto Cliente si se encuentra, o null si no se encuentra.
     */
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

    /**
     * Busca un cliente en la base de datos por su nombre.
     *
     * @param name El nombre del cliente a buscar.
     * @return El objeto Cliente si se encuentra.
     */
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

    /**
     * Busca un cliente en la base de datos por su correo electrónico.
     *
     * @param email El correo electrónico del cliente a buscar.
     * @return El objeto Cliente si se encuentra.
     */
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

    /**
     * Guarda un nuevo cliente en la base de datos.
     *
     * @param cliente El objeto Cliente a guardar.
     */
    @Override
    public Cliente saveCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();

            // Retornar el cliente gestionado por el EntityManager (incluye ID y otros valores generados)
            return cliente;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la información de un cliente existente en la base de datos.
     *
     * @param cliente El objeto Cliente con la información actualizada.
     */
    @Override
    public void updateCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Elimina un cliente de la base de datos por su ID.
     *
     * @param id El ID del cliente a eliminar.
     */
    @Override
    public void deleteClienteById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class, id);
            if (cliente != null) {
                em.remove(cliente);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public void close() {
        EntityManagerFactorySingleton.close();
    }
}
