package modelo.dao.impl;

import jakarta.persistence.*;
import modelo.dao.RolesDao;
import modelo.entity.Empleado;
import modelo.entity.Roles;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Chris
 */
/**
 * Implementación de la interfaz RolesDao para realizar operaciones CRUD sobre
 * la entidad Roles. Utiliza JPA para manejar la persistencia de datos en la
 * base de datos.
 */
public final class RolesImpl implements RolesDao {

    private EntityManagerFactory emf;

    public RolesImpl() {
        this.emf = EntityManagerFactorySingleton.getInstance();
       
    }

    /**
     * Obtiene una lista de todos los roles en la base de datos.
     *
     * @return Una lista de objetos Roles.
     */
    @Override
    public List<Roles> getAllRoles() {
        EntityManager em = emf.createEntityManager();
        List<Roles> rolesList = null;
        try {
            TypedQuery<Roles> query = em.createQuery("from Roles", Roles.class);
            rolesList = query.getResultList();
        } finally {
            em.close();
        }
        return rolesList;
    }

    /**
     * Busca un rol en la base de datos por su ID. (Actualmente no implementado,
     * retorna null)
     *
     * @param id El ID del rol a buscar.
     * @return El objeto Roles si se encuentra, o null si no se implementa.
     */
    @Override
    public Roles findRoleById(Long id) {
        return null;
    }

    /**
     * Busca un rol en la base de datos por su nombre.
     *
     * @param name El nombre del rol a buscar.
     * @return El objeto Roles si se encuentra.
     */
    @Override
    public Roles findRoleByName(String name) {
       EntityManager em = emf.createEntityManager();
    Roles role = null;
    try {
        TypedQuery<Roles> query = em.createQuery("from Roles where nombreRol = :name", Roles.class);
        query.setParameter("name", name);
        role = query.getSingleResult();
    } catch (NoResultException e) {
        // Aquí podrías registrar un mensaje o simplemente devolver null si no se encuentra el rol
        System.out.println("No se encontró el rol con nombre: " + name);
    } finally {
        em.close();
    }
    return role;
    }

    /**
     * Guarda un nuevo rol en la base de datos.
     *
     * @param role El objeto Roles a guardar.
     */
    @Override
    public void saveRole(Roles role) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(role);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la información de un rol existente en la base de datos.
     *
     * @param role El objeto Roles con la información actualizada.
     */
    @Override
    public void updateRole(Roles role) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(role);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Elimina un rol de la base de datos por su ID.
     *
     * @param id El ID del rol a eliminar.
     */
    @Override
    public void deleteRoleById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Roles role = em.find(Roles.class, id);
            if (role != null) {
                em.remove(role);
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
