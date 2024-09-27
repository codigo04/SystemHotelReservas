package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.dao.ClienteDao;
import modelo.entity.Cliente;

public class ClienteImpl implements ClienteDao {

    private EntityManagerFactory emf;

    public ClienteImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    @Override
    public Cliente agregar(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            return cliente;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al agregar cliente: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Cliente clienteExistente = em.find(Cliente.class, cliente.getIdCliente());
            if (clienteExistente != null) {
                clienteExistente.setDni(cliente.getDni());
                clienteExistente.setNombre(cliente.getNombre());
                clienteExistente.setApellido(cliente.getApellido());
                clienteExistente.setCorreoElectronico(cliente.getCorreoElectronico());
                clienteExistente.setCelular(cliente.getCelular());
                // Si es necesario, también podrías actualizar la lista de reservas del cliente
                clienteExistente.setReservas(cliente.getReservas());
                
                em.merge(clienteExistente);
                em.getTransaction().commit();
                return clienteExistente;
            } else {
                throw new RuntimeException("Cliente no encontrado con ID: " + cliente.getIdCliente());
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al actualizar cliente: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    @Override
    public boolean eliminar(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Cliente clienteExistente = em.find(Cliente.class, cliente.getIdCliente());
            if (clienteExistente != null) {
                em.remove(clienteExistente);
                em.getTransaction().commit();
                return true;
            } else {
                throw new RuntimeException("Cliente no encontrado con ID: " + cliente.getIdCliente());
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al eliminar cliente: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public void mostar(Cliente cliente) {
       EntityManager em = emf.createEntityManager();
        try {
            Cliente clienteExistente = em.find(Cliente.class, cliente.getIdCliente());
            if (clienteExistente != null) {
                System.out.println("Cliente ID: " + clienteExistente.getIdCliente());
                System.out.println("DNI: " + clienteExistente.getDni());
                System.out.println("Nombres: " + clienteExistente.getNombre());
                System.out.println("Apellidos: " + clienteExistente.getApellido());
                System.out.println("Correo Electrónico: " + clienteExistente.getCorreoElectronico());
                System.out.println("Celular: " + clienteExistente.getCelular());
                // Si quieres mostrar las reservas asociadas al cliente, también puedes hacerlo aquí.
                clienteExistente.getReservas().forEach(reserva -> {
                    System.out.println("Reserva ID: " + reserva.getIdReserva());
                    // Mostrar otros detalles de la reserva...
                });
            } else {
                System.out.println("Cliente no encontrado con ID: " + cliente.getIdCliente());
            }
        } finally {
            em.close();
        }
    }
}
