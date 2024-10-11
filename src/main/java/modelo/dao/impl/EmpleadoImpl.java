package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.EmpleadoDao;
import modelo.entity.Empleado;

/**
 *
 * @author Chris
 */
public class EmpleadoImpl implements EmpleadoDao {

    private EntityManagerFactory emf;

    public EmpleadoImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    @Override
    public List<Empleado> findAllEmpleados() {
        EntityManager em = emf.createEntityManager();
        List<Empleado> empleados = new ArrayList<>();
        try {
            em.getTransaction().begin();

            empleados = em.createQuery("SELECT e FROM Empleado e", Empleado.class).getResultList();

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al obtener empleados: " + e.getMessage());
        } finally {
            em.close();
        }

        return empleados;
    }

    @Override
    public Empleado agregar(Empleado t) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            
            em.persist(t);
            
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al crear empleado: " + e.getMessage());
        } finally {
            em.close();
        }
        
        
        return t;
    }

    @Override
    public Empleado actualizar(Empleado t) {
       
         EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al actualizar empleado: " + e.getMessage());
        } finally {
            em.close();
        }
        
        
       return t;
    }

    @Override
    public boolean eliminar(Empleado t) {
      EntityManager em = emf.createEntityManager();
        try {
            Empleado empleado = em.find(Empleado.class, t.getIdUsuarios());
            if (empleado != null) {
                em.getTransaction().begin();
                em.remove(empleado);
                em.getTransaction().commit();
            }
            
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
             
            return false;
        } finally {
            em.close();
        }
    
        
        
    }

    @Override
    public Empleado mostar(Empleado t) {
        EntityManager em = emf.createEntityManager();
        Empleado empleado = null;
        try {
            em.getTransaction().begin();
            empleado = em.find(Empleado.class, t.getIdUsuarios());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al obtener empleado: " + e.getMessage());
        } finally {
            em.close();
        }
        return empleado;
    }

}
