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
/**
 * Implementación de la interfaz TipoHabitacionDao para realizar operaciones
 * CRUD sobre la entidad TipoHabitacion. Utiliza JPA para manejar la
 * persistencia de datos en la base de datos.
 */
public class TipoHabitacionImpl implements TipoHabitacionDao {

    private EntityManagerFactory emf;

    public TipoHabitacionImpl() {
        this.emf = EntityManagerFactorySingleton.getInstance();

    }

    /**
     * Guarda un nuevo tipo de habitación en la base de datos.
     *
     * @param tipoHabitacion El objeto TipoHabitacion a guardar.
     */
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
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la información de un tipo de habitación existente en la base de
     * datos.
     *
     * @param tipoHabitacion El objeto TipoHabitacion con la información
     * actualizada.
     */
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
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Elimina un tipo de habitación de la base de datos por su ID.
     *
     * @param idTipo El ID del tipo de habitación a eliminar.
     */
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
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Busca un tipo de habitación en la base de datos por su ID.
     *
     * @param idTipo El ID del tipo de habitación a buscar.
     * @return Un Optional que contiene el tipo de habitación si se encuentra, o
     * vacío si no se encuentra.
     */
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

    /**
     * Obtiene una lista de todos los tipos de habitación en la base de datos.
     *
     * @return Una lista de objetos TipoHabitacion.
     */
    @Override
    public List<TipoHabitacion> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT th FROM TipoHabitacion th", TipoHabitacion.class).getResultList();
        } finally {
            em.close();
        }
    }

    /**
     * Busca un tipo de habitación en la base de datos por su nombre.
     *
     * @param tipoHabitacion El nombre del tipo de habitación a buscar.
     * @return Un Optional que contiene el tipo de habitación si se encuentra, o
     * vacío si no se encuentra.
     */
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
            return Optional.empty();
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        } finally {
            em.close();
        }
    }

    /**
     * Busca tipos de habitación en la base de datos con un precio menor al
     * especificado.
     *
     * @param precio El precio máximo.
     * @return Un Optional que contiene una lista de tipos de habitación con
     * precios menores que el especificado, o vacío si no se encuentran
     * resultados.
     */
    @Override
    public Optional<List<TipoHabitacion>> findByPrecioLessThan(Double precio) {
        EntityManager em = emf.createEntityManager();
        try {
            List<TipoHabitacion> tipos = em.createQuery(
                    "SELECT th FROM TipoHabitacion th WHERE th.precio < :precio", TipoHabitacion.class)
                    .setParameter("precio", precio)
                    .getResultList();
            return Optional.ofNullable(tipos.isEmpty() ? null : tipos);
        } finally {
            em.close();
        }
    }

    /**
     * Busca tipos de habitación en la base de datos con un precio mayor o igual
     * al especificado.
     *
     * @param precio El precio mínimo.
     * @return Un Optional que contiene una lista de tipos de habitación con
     * precios mayores o iguales que el especificado, o vacío si no se
     * encuentran resultados.
     */
    @Override
    public Optional<List<TipoHabitacion>> findByPrecioGreaterThanEqual(Double precio) {
        EntityManager em = emf.createEntityManager();
        try {
            List<TipoHabitacion> tipos = em.createQuery(
                    "SELECT th FROM TipoHabitacion th WHERE th.precio >= :precio", TipoHabitacion.class)
                    .setParameter("precio", precio)
                    .getResultList();
            return Optional.ofNullable(tipos.isEmpty() ? null : tipos);
        } finally {
            em.close();
        }
    }

    /**
     * Busca tipos de habitación en la base de datos cuyas características
     * contengan la cadena especificada.
     *
     * @param caracteristica La cadena de características a buscar.
     * @return Un Optional que contiene una lista de tipos de habitación que
     * coinciden con la característica, o vacío si no se encuentran resultados.
     */
    @Override
    public Optional<List<TipoHabitacion>> findByCaracteristicasContaining(String caracteristica) {
        EntityManager em = emf.createEntityManager();
        try {
            List<TipoHabitacion> tipos = em.createQuery(
                    "SELECT th FROM TipoHabitacion th WHERE th.caracteristicas LIKE :caracteristica", TipoHabitacion.class)
                    .setParameter("caracteristica", "%" + caracteristica + "%")
                    .getResultList();
            return Optional.ofNullable(tipos.isEmpty() ? null : tipos);
        } finally {
            em.close();
        }
    }
}
