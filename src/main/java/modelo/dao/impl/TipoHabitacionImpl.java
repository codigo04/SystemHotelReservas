/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.Optional;
import modelo.dao.TipoHabitacionDao;
import modelo.entity.TipoHabitacion;

/**
 *
 * @author FranDev
 */
public class TipoHabitacionImpl implements TipoHabitacionDao {

    private EntityManagerFactory emf;

    public TipoHabitacionImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    @Override
    public void save(TipoHabitacion tipoHabitacion) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(tipoHabitacion);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e; // Maneja la excepción según sea necesario
        } finally {
            em.close();
        }
    }

    @Override
    public void update(TipoHabitacion tipoHabitacion) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(tipoHabitacion);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e; // Maneja la excepción según sea necesario
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteById(Long idTipo) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            TipoHabitacion tipoHabitacion = em.find(TipoHabitacion.class, idTipo);
            if (tipoHabitacion != null) {
                em.remove(tipoHabitacion);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e; // Maneja la excepción según sea necesario
        } finally {
            em.close();
        }
    }

    @Override
    public Optional<TipoHabitacion> findById(Long idTipo) {
        EntityManager em = emf.createEntityManager();
        try {
            TipoHabitacion tipoHabitacion = em.find(TipoHabitacion.class, idTipo);
            return Optional.ofNullable(tipoHabitacion);
        } finally {
            em.close();
        }
    }

    @Override
    public List<TipoHabitacion> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT th FROM TipoHabitacion th", TipoHabitacion.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Optional<TipoHabitacion> findByTipoHabitacion(String tipoHabitacion) {
        EntityManager em = emf.createEntityManager();
        try {
            TipoHabitacion tipo = em.createQuery(
                    "SELECT th FROM TipoHabitacion th WHERE th.tipoHabitacion = :tipoHabitacion", TipoHabitacion.class)
                    .setParameter("tipoHabitacion", tipoHabitacion)
                    .getSingleResult();

            return Optional.of(tipo);

        } catch (NoResultException e) {
            // Si no se encuentra ningún resultado, devolvemos un Optional vacío
            return Optional.empty();
        } catch (Exception e) {
            e.printStackTrace();  // Manejo de excepción 
            return Optional.empty();
        } finally {
            em.close();  // cerrar el entity manager
        }
    }

    @Override
    public Optional<List<TipoHabitacion>> findByPrecioLessThan(Double precio) {
        EntityManager em = emf.createEntityManager();
        try {
            List<TipoHabitacion> tipos = em.createQuery("SELECT th FROM TipoHabitacion th WHERE th.precio < :precio", TipoHabitacion.class)
                    .setParameter("precio", precio)
                    .getResultList();
            return Optional.ofNullable(tipos.isEmpty() ? null : tipos);
        } finally {
            em.close();
        }
    }

    @Override
    public Optional<List<TipoHabitacion>> findByPrecioGreaterThanEqual(Double precio) {
        EntityManager em = emf.createEntityManager();
        try {
            List<TipoHabitacion> tipos = em.createQuery("SELECT th FROM TipoHabitacion th WHERE th.precio >= :precio", TipoHabitacion.class)
                    .setParameter("precio", precio)
                    .getResultList();
            return Optional.ofNullable(tipos.isEmpty() ? null : tipos);
        } finally {
            em.close();
        }
    }

    @Override
    public Optional<List<TipoHabitacion>> findByCaracteristicasContaining(String caracteristica) {
        EntityManager em = emf.createEntityManager();
        try {
            List<TipoHabitacion> tipos = em.createQuery("SELECT th FROM TipoHabitacion th WHERE th.caracteristicas LIKE :caracteristica", TipoHabitacion.class)
                    .setParameter("caracteristica", "%" + caracteristica + "%")
                    .getResultList();
            return Optional.ofNullable(tipos.isEmpty() ? null : tipos);
        } finally {
            em.close();
        }
    }
}
