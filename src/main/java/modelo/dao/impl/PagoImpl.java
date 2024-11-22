/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import modelo.dao.PagoDao;
import modelo.entity.Pago;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FranDev
 */
/**
 * Implementación de la interfaz PagoDao para realizar operaciones relacionadas
 * con pagos en la base de datos. Utiliza JPA para manejar la persistencia de
 * datos de la entidad Pago.
 */
public class PagoImpl implements PagoDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    /**
     * Constructor de PagoImpl. Inicializa el EntityManagerFactory y el
     * EntityManager utilizando la unidad de persistencia "myPU".
     */
    public PagoImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
        em = emf.createEntityManager();
    }

    /**
     * Busca pagos en la base de datos por su estado.
     *
     * @param estadoPago El estado del pago a buscar.
     * @return Un Optional que contiene una lista de pagos con el estado
     * especificado, o vacío si no se encuentran pagos con dicho estado.
     */
    @Override
    public Optional<List<Pago>> findPagosByEstadoPago(String estadoPago) {
        TypedQuery<Pago> query = em.createQuery("SELECT p FROM Pago p WHERE p.estadoPago = :estadoPago", Pago.class);
        query.setParameter("estadoPago", estadoPago);
        List<Pago> result = query.getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result);
    }

    /**
     * Busca pagos en la base de datos por la fecha de pago.
     *
     * @param fechaPago La fecha del pago a buscar.
     * @return Un Optional que contiene una lista de pagos realizados en la
     * fecha especificada, o vacío si no se encuentran pagos en esa fecha.
     */
    @Override
    public Optional<List<Pago>> findPagosByFechaPago(Date fechaPago) {
        TypedQuery<Pago> query = em.createQuery("SELECT p FROM Pago p WHERE p.fechaPago = :fechaPago", Pago.class);
        query.setParameter("fechaPago", fechaPago);
        List<Pago> result = query.getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result);
    }

    /**
     * Busca pagos en la base de datos por el método de pago.
     *
     * @param metodoPago El método de pago a buscar.
     * @return Un Optional que contiene una lista de pagos realizados con el
     * método especificado, o vacío si no se encuentran pagos con dicho método.
     */
    @Override
    public Optional<List<Pago>> findPagosByMetodoPago(String metodoPago) {
        TypedQuery<Pago> query = em.createQuery("SELECT p FROM Pago p WHERE p.metodoPago = :metodoPago", Pago.class);
        query.setParameter("metodoPago", metodoPago);
        List<Pago> result = query.getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result);
    }

    /**
     * Busca pagos en la base de datos realizados entre dos fechas.
     *
     * @param startDate La fecha de inicio del rango.
     * @param endDate La fecha de fin del rango.
     * @return Un Optional que contiene una lista de pagos realizados entre las
     * fechas especificadas, o vacío si no se encuentran pagos en ese rango de
     * fechas.
     */
    @Override
    public Optional<List<Pago>> findPagosBetweenFechas(Date startDate, Date endDate) {
        TypedQuery<Pago> query = em.createQuery("SELECT p FROM Pago p WHERE p.fechaPago BETWEEN :startDate AND :endDate", Pago.class);
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);
        List<Pago> result = query.getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result);
    }

    /**
     * Busca pagos en la base de datos por el ID de la reserva asociada.
     *
     * @param idReserva El ID de la reserva asociada al pago.
     * @return Un Optional que contiene una lista de pagos asociados a la
     * reserva especificada, o vacío si no se encuentran pagos para esa reserva.
     */
    @Override
    public Optional<List<Pago>> findPagosByReservaId(Long idReserva) {
        TypedQuery<Pago> query = em.createQuery("SELECT p FROM Pago p WHERE p.reserve.idReserva = :idReserva", Pago.class);
        query.setParameter("idReserva", idReserva);
        List<Pago> result = query.getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result);
    }

    /**
     * Obtiene el monto total pagado en la base de datos para todos los pagos
     * cuyo estado es "PAGADO".
     *
     * @return El monto total pagado. Si no hay pagos, devuelve 0.0.
     */
    @Override
    public Double obtenerMontoTotalPagado() {
        TypedQuery<Double> query = em.createQuery("SELECT SUM(p.montoPago) FROM Pago p WHERE p.estadoPago = 'PAGADO'", Double.class);
        Double totalPagado = query.getSingleResult();
        return (totalPagado != null) ? totalPagado : 0.0;
    }

    @Override
    public Optional<Pago> savePago(Pago pago) {
        try {
        em.getTransaction().begin(); // Inicia la transacción
        em.persist(pago);           // Guarda la entidad en la base de datos
        em.getTransaction().commit(); // Confirma la transacción
        return Optional.of(pago);   // Retorna el pago guardado
    } catch (Exception e) {
        em.getTransaction().rollback(); // Reversa la transacción si hay error
        e.printStackTrace();            // Registra el error
        return Optional.empty();        // Retorna vacío si hay un problema
    }
    }

    @Override
    public Optional<Pago> editPago(int idPago, Pago pago) {
        try {
        em.getTransaction().begin(); // Inicia la transacción
        
        // Busca el pago existente por su ID
        Pago pagoExistente = em.find(Pago.class, idPago);
        
        if (pagoExistente != null) {
            // Actualiza los campos del pago existente con los nuevos valores
            pagoExistente.setMontoPago(pago.getMontoPago());
            pagoExistente.setEstadoPago(pago.getEstadoPago());
            pagoExistente.setFechaPago(pago.getFechaPago());
            // Agrega aquí más campos si es necesario

            em.merge(pagoExistente); // Actualiza la entidad en la base de datos
            em.getTransaction().commit(); // Confirma la transacción
            return Optional.of(pagoExistente); // Retorna el pago actualizado
        } else {
            em.getTransaction().rollback(); // Reversa la transacción si no encuentra el pago
            return Optional.empty();        // Retorna vacío si no existe el pago
        }
    } catch (Exception e) {
        em.getTransaction().rollback(); // Reversa la transacción si hay error
        e.printStackTrace();            // Registra el error
        return Optional.empty();        // Retorna vacío si hay un problema
    }
    }
}
