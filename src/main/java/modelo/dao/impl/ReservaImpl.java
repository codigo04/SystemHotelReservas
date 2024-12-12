package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import modelo.dao.ReservaDao;
import modelo.entity.Reserva;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import modelo.entity.Habitacion;

/**
 *
 * @author Chris
 */
/**
 * Implementación de la interfaz ReservaDao para realizar operaciones CRUD sobre
 * la entidad Reserva. Utiliza JPA para manejar la persistencia de datos en la
 * base de datos.
 */
public final class ReservaImpl implements ReservaDao {

    private EntityManagerFactory emf;

    public ReservaImpl() {
        this.emf = EntityManagerFactorySingleton.getInstance();

    }

    /**
     * Obtiene una lista de todas las reservas en la base de datos.
     *
     * @return Una lista de objetos Reserva.
     */
    @Override
    public List<Reserva> getAllReservas() {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try {
            TypedQuery<Reserva> query = em.createQuery("from Reserva", Reserva.class);
            reservas = query.getResultList();
        } finally {
            em.close();
        }
        return reservas;
    }

    /**
     * Busca una reserva en la base de datos por su ID.
     *
     * @param id El ID de la reserva a buscar.
     * @return El objeto Reserva si se encuentra, o null si no se encuentra.
     */
    @Override
    public Reserva findReservaById(Long id) {
        EntityManager em = emf.createEntityManager();
        Reserva reserva = null;
        try {
            reserva = em.find(Reserva.class, id);
        } finally {
            em.close();
        }
        return reserva;
    }

    public Optional<Reserva> findReservaByCodigoReserva(String codigoReserva) {
        EntityManager em = emf.createEntityManager();
        try {
            // Usamos JPQL para buscar la reserva por su código
            TypedQuery<Reserva> query = em.createQuery("SELECT r FROM Reserva r WHERE r.codigoReserva = :codigo", Reserva.class);
            query.setParameter("codigo", codigoReserva);

            // Intentamos obtener un único resultado
            Reserva reserva = null;
            try {
                reserva = query.getSingleResult(); // Lanzará NoResultException si no encuentra resultados
            } catch (NoResultException e) {
                // Si no se encuentra la reserva, retornamos Optional vacío
                return Optional.empty();
            }

            // Envolvemos el resultado en un Optional para evitar null
            return Optional.of(reserva);
        } catch (Exception e) {
            // Manejo de excepciones generales
            System.err.println("Error al buscar la reserva: " + e.getMessage());
            return Optional.empty(); // En caso de error, retornamos un Optional vacío
        } finally {
            em.close(); // Aseguramos el cierre del EntityManager
        }
    }

    /**
     * Guarda una nueva reserva en la base de datos.
     *
     * @param reserva El objeto Reserva a guardar.
     */
    @Override
    public Optional<Reserva> saveReserva(Reserva reserva
    ) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(reserva);
            em.getTransaction().commit();
            return Optional.of(reserva); // Devolvemos la reserva dentro de Optional
        } catch (Exception e) {
            em.getTransaction().rollback();
            return Optional.empty(); // Propagamos la excepción para manejarla en el nivel superior
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la información de una reserva existente en la base de datos.
     *
     * @param reserva El objeto Reserva con la información actualizada.
     */
    @Override
    public void updateReserva(Reserva reserva
    ) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(reserva);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Elimina una reserva de la base de datos por su ID.
     *
     * @param id El ID de la reserva a eliminar.
     */
    @Override
    public void deleteReservaById(Long id
    ) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Reserva reserva = em.find(Reserva.class, id);
            if (reserva != null) {
                em.remove(reserva);
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
     * Busca reservas en la base de datos por el ID del cliente.
     *
     * @param idCliente El ID del cliente asociado a las reservas.
     * @return Una lista de reservas asociadas al cliente especificado.
     */
    @Override
    public List<Reserva> findReservasByClienteId(Long idCliente
    ) {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try {
            TypedQuery<Reserva> query = em.createQuery("from Reserva where cliente.idCliente = :idCliente", Reserva.class);
            query.setParameter("idCliente", idCliente);
            reservas = query.getResultList();
        } finally {
            em.close();
        }
        return reservas;
    }

    /**
     * Busca reservas en la base de datos que están programadas entre dos fechas
     * específicas.
     *
     * @param fechaInicio La fecha de inicio del rango de búsqueda.
     * @param fechaFin La fecha de fin del rango de búsqueda.
     * @return Una lista de reservas que están programadas entre las fechas
     * especificadas.
     */
    @Override
    public List<Reserva> findReservasByFecha(Date fechaInicio, Date fechaFin
    ) {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try {
            TypedQuery<Reserva> query = em.createQuery("from Reserva where fechaLlegada >= :fechaInicio and fechaFin <= :fechaFin", Reserva.class);
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);
            reservas = query.getResultList();
        } finally {
            em.close();
        }
        return reservas;
    }

    public List<Object[]> obtenerOcupacionPorDiaSemana() {
        EntityManager em = emf.createEntityManager();
        String sql = "SELECT DAYNAME(r.fechaLlegada) AS dia_semana, COUNT(r.idReserva) AS total_reservas "
                + "FROM Reserva r "
                + "GROUP BY dia_semana "
                + "ORDER BY FIELD(dia_semana,  'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday')";

        Query query = em.createNativeQuery(sql);
        return query.getResultList();
    }

    public static void main(String[] args) {
        ReservaImpl reservaImpl = new ReservaImpl();
        List<Object[]> ocupacionPorDia = reservaImpl.obtenerOcupacionPorDiaSemana();

        // Mapeo de días de la semana en inglés a español
        Map<String, String> diasSemanaMap = new HashMap<>();
        diasSemanaMap.put("Monday", "Lunes");
        diasSemanaMap.put("Tuesday", "Martes");
        diasSemanaMap.put("Wednesday", "Miércoles");
        diasSemanaMap.put("Thursday", "Jueves");
        diasSemanaMap.put("Friday", "Viernes");
        diasSemanaMap.put("Saturday", "Sábado");
        diasSemanaMap.put("Sunday", "Domingo");

        for (Object[] row : ocupacionPorDia) {
            String diaSemanaIngles = (String) row[0];
            String diaSemanaEspanol = diasSemanaMap.getOrDefault(diaSemanaIngles, diaSemanaIngles);
            Long totalReservas = ((Number) row[1]).longValue();
            System.out.println("Día: " + diaSemanaEspanol + ", Total de reservas: " + totalReservas);
        }
    }

    public Habitacion encontrarHabitacionDeReserva(Long idReserva) {
        EntityManager em = emf.createEntityManager();
        Habitacion habitacion = null;
        try {
            // Crear una consulta para obtener la reserva por idReserva
            Reserva reserva = em.find(Reserva.class, idReserva);

            if (reserva != null) {
                // Si la reserva existe, devolver la habitación asociada
                habitacion = reserva.getHabitacion();
            }
        } finally {
            em.close();
        }
        return habitacion;
    }

    public List<Reserva> obtenerReservasPorHabitacion(Long idHabitacion) {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try {
            TypedQuery<Reserva> query = em.createQuery(
                    "FROM Reserva WHERE habitacion.idHabitacion = :idHabitacion", Reserva.class);
            query.setParameter("idHabitacion", idHabitacion);
            reservas = query.getResultList();
        } finally {
            em.close();
        }
        return reservas;
    }
}
