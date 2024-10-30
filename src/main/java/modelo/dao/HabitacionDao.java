package modelo.dao;

import modelo.entity.Habitacion;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Chris
 */
public interface HabitacionDao {

    // Obtener todas las habitaciones
    List<Habitacion> getAllHabitaciones();

    // Buscar una habitación por su ID
    Optional<Habitacion> findHabitacionById(Long id);

    // Buscar habitaciones por tipo (ejemplo: simple, doble, suite)
    List<Habitacion> findHabitacionesByTipo(String tipo);

    // Buscar habitaciones disponibles
    Optional<List<Habitacion>> findHabitacionesPorEstado(String estado);

    // Guardar una nueva habitación
    void saveHabitacion(Habitacion habitacion);

    // Actualizar los detalles de una habitación existente
    void updateHabitacion(Habitacion habitacion);

    // Eliminar una habitación por su ID
    void deleteHabitacionById(Long id);

    // Actualizar el estado de disponibilidad de una habitación (disponible/no disponible)
    void updateDisponibilidadHabitacion(Long id, String estado);

    // Buscar habitaciones por precio máximo
    //List<Habitacion> findHabitacionesByPrecioMax(double precioMax);
}
