package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
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
/**
 * Implementación de la interfaz HabitacionDao para realizar operaciones CRUD
 * sobre la entidad Habitacion. Utiliza JPA para manejar la persistencia de
 * datos en una base de datos.
 */
public class HabitacionImpl implements HabitacionDao {

    private EntityManagerFactory emf;

    public HabitacionImpl() {
        this.emf = EntityManagerFactorySingleton.getInstance();

    }

    /**
     * Obtiene una lista de todas las habitaciones en la base de datos.
     *
     * @return Una lista de objetos Habitacion.
     */
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

    /**
     * Busca una habitación en la base de datos por su ID.
     *
     * @param id El ID de la habitación a buscar.
     * @return Un Optional que contiene la habitación si se encuentra, o vacío
     * si no se encuentra.
     */
    @Override
    public Optional<Habitacion> findHabitacionById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            Habitacion habitacion = em.find(Habitacion.class, id);
            return Optional.of(habitacion);
        } catch (Exception e) {
            return Optional.empty();
        } finally {
            em.close();
        }
    }

    /**
     * Busca habitaciones en la base de datos por su tipo.
     *
     * @param tipo El tipo de la habitación a buscar.
     * @return Una lista de habitaciones que coinciden con el tipo especificado.
     */
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

    /**
     * Busca habitaciones en la base de datos por su estado.
     *
     * @param estado El estado de la habitación a buscar.
     * @return Un Optional que contiene una lista de habitaciones con el estado
     * especificado, o vacío si no se encuentran habitaciones con dicho estado.
     */
    @Override
    public Optional<List<Habitacion>> findHabitacionesPorEstado(String estado) {
        EntityManager em = emf.createEntityManager();
        List<Habitacion> habitaciones = null;
        try {
            TypedQuery<Habitacion> query = em.createQuery("from Habitacion where estado = :estado", Habitacion.class);
            query.setParameter("estado", estado);
            habitaciones = query.getResultList();
        } finally {
            em.close();
        }
        return Optional.ofNullable(habitaciones);
    }

    @Override
    public Optional<Habitacion> findHabitacionesPorNumHabitacion(String numeroHabi) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Habitacion> query = em.createQuery("FROM Habitacion WHERE numeroDeHabitacion = :numero", Habitacion.class);
            query.setParameter("numero", numeroHabi);
            List<Habitacion> resultList = query.getResultList();

            return resultList.isEmpty() ? Optional.empty() : Optional.of(resultList.get(0));
        } finally {
            em.close();
        }
    }

    /**
     * Guarda una nueva habitación en la base de datos.
     *
     * @param habitacion El objeto Habitacion a guardar.
     */
    @Override
    public Habitacion saveHabitacion(Habitacion habitacion) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(habitacion);
            em.getTransaction().commit();

            // Retornar la habitacion gestionada por el EntityManager (incluye valores generados)
            return habitacion;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la información de una habitación existente en la base de datos.
     *
     * @param habitacion El objeto Habitacion con la información actualizada.
     */
    @Override
    public void updateHabitacion(Habitacion habitacion) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(habitacion);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Elimina una habitación de la base de datos por su ID.
     *
     * @param id El ID de la habitación a eliminar.
     */
    @Override
    public void deleteHabitacionById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Habitacion habitacion = em.find(Habitacion.class, id);
            if (habitacion != null) {
                em.remove(habitacion);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la disponibilidad de una habitación.
     *
     * @param id El ID de la habitación cuya disponibilidad se actualizará.
     * @param estado El nuevo estado de disponibilidad de la habitación.
     */
    @Override
    public void updateDisponibilidadHabitacion(Long id, String estado) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Habitacion habitacion = em.find(Habitacion.class, id);
            if (habitacion != null) {
                habitacion.setEstado(estado);
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
