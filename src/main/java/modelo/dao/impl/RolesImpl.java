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
@Repository
public final class RolesImpl implements RolesDao {

    private EntityManagerFactory emf;


    public RolesImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }




    @Override
    public List<Roles> getAllRoles() {
        EntityManager em = emf.createEntityManager();
        List<Roles> rolesList = null;
        try {
            TypedQuery<Roles> query = em.createQuery("from Roles", Roles.class);
            rolesList = query.getResultList();
        } finally {
            em.close(); // Siempre cerrar el EntityManager
        }
        return rolesList;
    }


    @Override
    public Roles findRoleById(Long id) {
       return null;
    }

    @Override
    public Roles findRoleByName(String name) {
        EntityManager em = emf.createEntityManager();
        Roles role = null;
        try {
            TypedQuery<Roles> query = em.createQuery("from Roles where nombreRol = :name", Roles.class);
            query.setParameter("name", name);
            role = query.getSingleResult();
        } finally {
            em.close();
        }
        return role;
    }

    @Override
    public void saveRole(Roles role) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin(); // Iniciar la transacción
            em.persist(role);            // Guardar el nuevo rol
            em.getTransaction().commit(); // Confirmar la transacción
        } catch (Exception e) {
            em.getTransaction().rollback(); // Revertir en caso de error
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void updateRole(Roles role) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(role);               // Actualizar el rol existente
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteRoleById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Roles role = em.find(Roles.class, id);
            if (role != null) {
                em.remove(role);           // Eliminar el rol por id
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
