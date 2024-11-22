/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import modelo.dao.TicketDao;
import modelo.entity.Ticket;

/**
 *
 * @author FranDev
 */
public class TicketImpl implements TicketDao {

   private EntityManagerFactory emf;
   
    public TicketImpl() {
        this.emf = EntityManagerFactorySingleton.getInstance();
        
    }

    
    
    
    
    
    
    
    
    @Override
    public Optional<Ticket> saveTicket(Ticket ticket) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(ticket);
            em.getTransaction().commit();
            return Optional.of(ticket);
        } catch (Exception e) {

            em.getTransaction().rollback();
            // throw new RuntimeException("Error al guardar el ticket", e);

            return Optional.empty();
        }
    }

    @Override
    public Optional<Ticket> findById(int id) {
        EntityManager em = emf.createEntityManager();
        Ticket ticket = em.find(Ticket.class, id);
        return Optional.ofNullable(ticket);
    }

    @Override
    public List<Ticket> findAll() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Ticket> query = em.createQuery("SELECT t FROM Ticket t", Ticket.class);
        return query.getResultList();
    }

    @Override
    public Optional<Ticket> updateTicket(int id, Ticket ticket) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Ticket existingTicket = em.find(Ticket.class, id);
            if (existingTicket != null) {
                existingTicket.setReserva(ticket.getReserva());
                // existingTicket.setFecha(ticket.getFecha());
                existingTicket.setMontoTotal(ticket.getMontoTotal());

                // Actualiza otros campos según sea necesario
                em.merge(existingTicket);
                em.getTransaction().commit();
                return Optional.of(existingTicket);
            }
            em.getTransaction().rollback();
            return Optional.empty();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al actualizar el ticket", e);
        }
    }

    @Override
    public boolean deleteById(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Ticket ticket = em.find(Ticket.class, id);
            if (ticket != null) {
                em.remove(ticket);
                em.getTransaction().commit();
                return true;
            }
            em.getTransaction().rollback();
            return false;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al eliminar el ticket", e);
        }
    }

    @Override
    public List<Ticket> findByDate(LocalDate fecha) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Ticket> query = em.createQuery(
                "SELECT t FROM Ticket t WHERE t.fecha = :fecha", Ticket.class);
        query.setParameter("fecha", fecha);
        return query.getResultList();
    }

    @Override
    public List<Ticket> findByClienteId(int clienteId) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Ticket> query = em.createQuery(
                "SELECT t FROM Ticket t WHERE t.cliente.id = :clienteId", Ticket.class);
        query.setParameter("clienteId", clienteId);
        return query.getResultList();
    }

    @Override
    public Optional<Ticket> findLatest() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Ticket> query = em.createQuery(
                "SELECT t FROM Ticket t ORDER BY t.fecha DESC", Ticket.class);
        query.setMaxResults(1);
        List<Ticket> result = query.getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result.get(0));
    }

    @Override
    public Double calculateTotalAmount() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Double> query = em.createQuery(
                "SELECT SUM(t.monto) FROM Ticket t", Double.class);
        Double total = query.getSingleResult();
        return (total != null) ? total : 0.0;
    }

}
