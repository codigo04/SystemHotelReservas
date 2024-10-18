package modelo.dao.impl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import modelo.dao.ReservaDao;
import modelo.entity.Reserva;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Chris
 */
public final class ReservaImpl implements ReservaDao {

    private EntityManagerFactory emf;


    public ReservaImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    @Override
    public List<Reserva> getAllReservas() {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try {
            TypedQuery<Reserva> query = em.createQuery("from Reserva", Reserva.class);
            reservas = query.getResultList();
        } finally {
            em.close();
        }
        return reservas;
    }

    @Override
    public Reserva findReservaById(Long id) {
        EntityManager em = emf.createEntityManager();
        Reserva reserva = null;
        try {
            reserva = em.find(Reserva.class, id);
        } finally {
            em.close();
        }
        return reserva;
    }

    @Override
    public void saveReserva(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(reserva);  // Guardar nueva reserva
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();  // Revertir en caso de error
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void updateReserva(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(reserva);  // Actualizar reserva existente
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteReservaById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Reserva reserva = em.find(Reserva.class, id);
            if (reserva != null) {
                em.remove(reserva);  // Eliminar reserva
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Reserva> findReservasByClienteId(Long idCliente) {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try {
            TypedQuery<Reserva> query = em.createQuery("from Reserva where cliente.idCliente = :idCliente", Reserva.class);
            query.setParameter("idCliente", idCliente);
            reservas = query.getResultList();
        } finally {
            em.close();
        }
        return reservas;
    }

    @Override
    public List<Reserva> findReservasByFecha(Date fechaInicio, Date fechaFin) {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try {
            TypedQuery<Reserva> query = em.createQuery("from Reserva where fechaLLegada >= :fechaInicio and fechaFin <= :fechaFin", Reserva.class);
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);
            reservas = query.getResultList();
        } finally {
            em.close();
        }
        return reservas;
    }
    
}
