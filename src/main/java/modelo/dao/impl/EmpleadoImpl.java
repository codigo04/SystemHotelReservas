package modelo.dao.impl;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import jakarta.transaction.Transactional;
import java.util.Optional;
import modelo.dao.EmpleadoDao;
import modelo.entity.Empleado;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chris
 */
@Repository
public class EmpleadoImpl implements EmpleadoDao {

    private EntityManagerFactory emf;

    public EmpleadoImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    @Override
    public List<Empleado> getAllEmpleados() {
        EntityManager em = emf.createEntityManager();
        List<Empleado> empleados = null;
        try {
            TypedQuery<Empleado> query = em.createQuery("from Empleado", Empleado.class);
            empleados = query.getResultList();
        } finally {
            em.close();
        }
        return empleados;
    }

    @Override
    public Empleado findEmpleadoById(Long id) {
        EntityManager em = emf.createEntityManager();
        Empleado empleado = null;
        try {
            empleado = em.find(Empleado.class, id);
        } finally {
            em.close();
        }
        return empleado;
    }

    @Override
    public Empleado findEmpleadoByName(String name) {
        EntityManager em = emf.createEntityManager();
        Empleado empleado = null;
        try {
            TypedQuery<Empleado> query = em.createQuery("from Empleado where nombre = :name", Empleado.class);
            query.setParameter("name", name);
            empleado = query.getSingleResult();
        } finally {
            em.close();
        }
        return empleado;
    }

    @Override
    public void saveEmpleado(Empleado empleado) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(empleado);  // Persistir el nuevo empleado
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();  // Revertir en caso de error
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(empleado);  // Actualizar el empleado existente
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteEmpleadoById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Empleado empleado = em.find(Empleado.class, id);
            if (empleado != null) {
                em.remove(empleado);  // Eliminar el empleado si se encuentra
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
    public List<Empleado> findEmpleadosByRole(String role) {
        EntityManager em = emf.createEntityManager();
        List<Empleado> empleados = null;
        try {
            TypedQuery<Empleado> query = em.createQuery("from Empleado where Roles = :role", Empleado.class);
            query.setParameter("role", role);
            empleados = query.getResultList();
        } finally {
            em.close();
        }
        return empleados;
    }

    @Override
    public Optional<Empleado> findEmpleadoByDni(String dni) {
        EntityManager em = emf.createEntityManager();
        Empleado empleado = null;
        try {
            TypedQuery<Empleado> query = em.createQuery("from Empleado where dni = :dni", Empleado.class);
            query.setParameter("dni", dni);
            empleado = query.getSingleResult();
        } finally {
            em.close();
        }
        return Optional.of(empleado);
    }

}
