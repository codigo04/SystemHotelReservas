package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import modelo.dao.ServicioDao;
import modelo.entity.Servicio;

import java.util.List;

/**
 * Implementación de la interfaz ServicioDao para realizar operaciones CRUD
 * sobre la entidad Servicio. Utiliza JPA para manejar la persistencia de datos
 * en la base de datos.
 */
public class ServicioImpl implements ServicioDao {

    private EntityManagerFactory emf;

    /**
     * Constructor de ServicioImpl. Inicializa el EntityManagerFactory
     * utilizando la unidad de persistencia "myPU".
     */
    public ServicioImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    /**
     * Obtiene una lista de todos los servicios en la base de datos.
     *
     * @return Una lista de objetos Servicio.
     */
    @Override
    public List<Servicio> getAllServicios() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Servicio> query = em.createQuery("SELECT s FROM Servicios s", Servicio.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    /**
     * Busca un servicio en la base de datos por su ID.
     *
     * @param id El ID del servicio a buscar.
     * @return El objeto Servicio si se encuentra, o null si no se encuentra.
     */
    @Override
    public Servicio findServicioById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Servicio.class, id);
        } finally {
            em.close();
        }
    }

    /**
     * Guarda un nuevo servicio en la base de datos.
     *
     * @param servicio El objeto Servicio a guardar.
     * @throws javax.persistence.RollbackException si ocurre un error durante la
     * transacción.
     */
    @Override
    public void saveServicio(Servicio servicio) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(servicio);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la información de un servicio existente en la base de datos.
     *
     * @param servicio El objeto Servicio con la información actualizada.
     * @throws javax.persistence.RollbackException si ocurre un error durante la
     * transacción.
     */
    @Override
    public void updateServicio(Servicio servicio) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(servicio);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /**
     * Elimina un servicio de la base de datos por su ID.
     *
     * @param id El ID del servicio a eliminar.
     */
    @Override
    public void deleteServicioById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Servicio servicio = em.find(Servicio.class, id);
            if (servicio != null) {
                em.remove(servicio);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
