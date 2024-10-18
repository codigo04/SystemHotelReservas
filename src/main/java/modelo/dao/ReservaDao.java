package modelo.dao;
import modelo.entity.Reserva;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Chris
 * @author FranDev
 */
public interface ReservaDao {
    /**
     * Obtiene una lista de todas las reservas.
     *
     * @return una lista de objetos Reserva.
     */
    List<Reserva> getAllReservas();

    /**
     * Busca una reserva por su ID.
     *
     * @param id el ID de la reserva a buscar.
     * @return el objeto Reserva correspondiente al ID proporcionado, o null si no se encuentra.
     */
    Reserva findReservaById(Long id);

    /**
     * Guarda una nueva reserva en la base de datos.
     *
     * @param reserva el objeto Reserva a guardar.
     */
    void saveReserva(Reserva reserva);

    /**
     * Actualiza una reserva existente en la base de datos.
     *
     * @param reserva el objeto Reserva con la información actualizada.
     */
    void updateReserva(Reserva reserva);

    /**
     * Elimina una reserva por su ID.
     *
     * @param id el ID de la reserva a eliminar.
     */
    void deleteReservaById(Long id);

    /**
     * Busca todas las reservas realizadas por un cliente específico.
     *
     * @param idCliente el ID del cliente cuyas reservas se buscan.
     * @return una lista de objetos Reserva asociada al cliente proporcionado.
     */
    List<Reserva> findReservasByClienteId(Long idCliente);

    /**
     * Busca reservas que estén dentro de un rango de fechas específico.
     *
     * @param fechaInicio la fecha de inicio del rango.
     * @param fechaFin    la fecha de fin del rango.
     * @return una lista de objetos Reserva que se encuentran en el rango de fechas.
     */
    List<Reserva> findReservasByFecha(Date fechaInicio, Date fechaFin);
}
