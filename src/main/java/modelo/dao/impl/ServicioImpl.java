package modelo.dao.impl;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import modelo.dao.ServicioDao;
import modelo.entity.Servicio;

import java.util.List;

public class ServicioImpl  implements ServicioDao {


    private EntityManagerFactory emf;

    public ServicioImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

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

    @Override
    public Servicio findServicioById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Servicio.class, id);
        } finally {
            em.close();
        }
    }

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
