package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.Persistence;
import modelo.dao.RolesDao;
import modelo.entity.Empleado;
import modelo.entity.Roles;

/**
 *
 * @author Chris
 */
public final class RolesImpl implements RolesDao {

    private EntityManagerFactory emf;

    public RolesImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    public Roles agregar(Roles t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Roles actualizar(Roles t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean eliminar(Roles t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Roles mostar(Roles t) {

        EntityManager em = emf.createEntityManager();

        System.out.println("el rol es:" + t.getNombreRol());
        Roles rol = null;

        try {
            em.getTransaction().begin();

            rol = em.find(Roles.class, "ADMIN");

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al buscar el rol: " + e.getMessage());
        } finally {
            em.close();
        }

        return rol;
    }

    public Roles mostar2(String t) {

        EntityManager em = emf.createEntityManager();
        Roles rol = null;

        try {
            em.getTransaction().begin();

            rol = em.createQuery("SELECT r FROM Roles r WHERE r.nombreRol = :nombreRol", Roles.class)
                    .setParameter("nombreRol", t)
                    .getSingleResult();

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al buscar el rol: " + e.getMessage());
        } finally {
            em.close();
        }

        return rol; // Devuelve el rol encontrado o null si no existe
    }

}
