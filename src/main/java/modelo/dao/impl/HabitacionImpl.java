package modelo.dao.impl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import modelo.dao.HabitacionDao;
import modelo.entity.Habitacion;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Chris
 */
public  class HabitacionImpl implements HabitacionDao {

    private EntityManagerFactory emf;

    public HabitacionImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }


    @Override
    public List<Habitacion> getAllHabitaciones() {
        EntityManager em = emf.createEntityManager();
        List<Habitacion> habitaciones = null;
        try {
            TypedQuery<Habitacion> query = em.createQuery("from Habitacion", Habitacion.class);
            habitaciones = query.getResultList();
        } finally {
            em.close();
        }
        return habitaciones;
    }

    
    
    @Override
    public Optional<Habitacion> findHabitacionById(Long id) {
        EntityManager em = emf.createEntityManager();

        try {
            Habitacion habitacion = em.find(Habitacion.class, id);

            return Optional.of(habitacion);
        } catch (Exception e) {

            return Optional.empty();
        }finally {
            em.close();
        }

    }

    @Override
    public List<Habitacion> findHabitacionesByTipo(String tipo) {
        EntityManager em = emf.createEntityManager();
        List<Habitacion> habitaciones = null;
        try {
            TypedQuery<Habitacion> query = em.createQuery("from Habitacion where tipoHabitacion = :tipo", Habitacion.class);
            query.setParameter("tipo", tipo);
            habitaciones = query.getResultList();
        } finally {
            em.close();
        }
        return habitaciones;
    }

    @Override
    public List<Habitacion> findHabitacionesDisponibles() {
        EntityManager em = emf.createEntityManager();
        List<Habitacion> habitaciones = null;
        try {
            TypedQuery<Habitacion> query = em.createQuery("from Habitacion where estado = estado", Habitacion.class);
            habitaciones = query.getResultList();
        } finally {
            em.close();
        }
        return habitaciones;
    }

    @Override
    public void saveHabitacion(Habitacion habitacion) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(habitacion);  // Guardar nueva habitación
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();  // Revertir en caso de error
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void updateHabitacion(Habitacion habitacion) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(habitacion);  // Actualizar habitación existente
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteHabitacionById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Habitacion habitacion = em.find(Habitacion.class, id);
            if (habitacion != null) {
                em.remove(habitacion);  // Eliminar habitación
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
    public void updateDisponibilidadHabitacion(Long id, String estado) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Habitacion habitacion = em.find(Habitacion.class, id);
            if (habitacion != null) {
                habitacion.setEstado(estado);  // Actualizar disponibilidad
                em.merge(habitacion);
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
