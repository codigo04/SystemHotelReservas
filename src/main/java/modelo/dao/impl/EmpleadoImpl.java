package modelo.dao.impl;

import jakarta.persistence.*;

import java.util.List;

import java.util.Optional;
import modelo.dao.EmpleadoDao;
import modelo.entity.Empleado;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chris
 */

/**
 * Implementación de la interfaz EmpleadoDao para realizar operaciones CRUD sobre la entidad Empleado.
 * Utiliza JPA para manejar la persistencia de datos en una base de datos.
 */
public class EmpleadoImpl implements EmpleadoDao {

    private EntityManagerFactory emf;

    /**
     * Constructor de EmpleadoImpl.
     * Inicializa el EntityManagerFactory utilizando la unidad de persistencia "myPU".
     */
    public EmpleadoImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    /**
     * Obtiene una lista de todos los empleados en la base de datos.
     *
     * @return Una lista de objetos Empleado.
     */
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

    /**
     * Busca un empleado en la base de datos por su ID.
     *
     * @param id El ID del empleado a buscar.
     * @return El objeto Empleado si se encuentra, o null si no se encuentra.
     */
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

    /**
     * Busca un empleado en la base de datos por su nombre.
     *
     * @param name El nombre del empleado a buscar.
     * @return El objeto Empleado si se encuentra.
     */
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

    /**
     * Guarda un nuevo empleado en la base de datos.
     *
     * @param empleado El objeto Empleado a guardar.
     */
    @Override
    public void saveEmpleado(Empleado empleado) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la información de un empleado existente en la base de datos.
     *
     * @param empleado El objeto Empleado con la información actualizada.
     */
    @Override
    public void updateEmpleado(Empleado empleado) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Elimina un empleado de la base de datos por su ID.
     *
     * @param id El ID del empleado a eliminar.
     */
    @Override
    public void deleteEmpleadoById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Empleado empleado = em.find(Empleado.class, id);
            if (empleado != null) {
                em.remove(empleado);
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
     * Busca empleados por su rol en la base de datos.
     *
     * @param role El rol de los empleados a buscar.
     * @return Una lista de empleados que coinciden con el rol especificado.
     */
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

    /**
     * Busca un empleado en la base de datos por su DNI.
     *
     * @param dni El DNI del empleado a buscar.
     * @return Un Optional que contiene el empleado si se encuentra, o vacío si no se encuentra.
     */
    @Override
    public Optional<Empleado> findEmpleadoByDni(String dni) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Empleado> query = em.createQuery("from Empleado where dni = :dni", Empleado.class);
            query.setParameter("dni", dni);
            Empleado empleado = query.getSingleResult();
            System.out.println("Empleado encontrado");
            return Optional.of(empleado);
        } catch (NoResultException e) {
            System.out.println("Empleado no encontrado");
            return Optional.empty();
        } finally {
            em.close();
        }
    }

    /**
     * Autentica un empleado verificando su correo electrónico y contraseña.
     *
     * @param correoElectronico El correo electrónico del empleado.
     * @param password          La contraseña del empleado.
     * @return Un Optional que contiene el empleado si las credenciales son válidas, o vacío si no lo son.
     */
    @Override
    public Optional<Empleado> authenticateEmpleado(String correoElectronico, String password) {
        EntityManager em = emf.createEntityManager();
        Empleado empleado = null;
        try {
            TypedQuery<Empleado> query = em.createQuery("FROM Empleado WHERE correoElectronico = :correo AND password = :pass", Empleado.class);
            query.setParameter("correo", correoElectronico);
            query.setParameter("pass", password);
            empleado = query.getSingleResult();
        } catch (NoResultException e) {
            System.out.println("Credenciales inválidas");
            return Optional.empty();
        } finally {
            em.close();
        }
        return Optional.of(empleado);
    }
}
