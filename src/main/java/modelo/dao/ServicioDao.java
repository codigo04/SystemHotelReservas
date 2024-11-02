package modelo.dao;
import modelo.entity.Servicio;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Chris
 */
public interface ServicioDao  {
    /**
     * Obtiene una lista de todos los servicios.
     *
     * @return una lista de objetos Servicio.
     */
    List<Servicio> getAllServicios();

    /**
     * Busca un servicio por su ID.
     *
     * @param id el ID del servicio a buscar.
     * @return el objeto Servicio correspondiente al ID proporcionado, o null si no se encuentra.
     */
    Optional<Servicio> findServicioById(Long id);

    /**
     * Guarda un nuevo servicio en la base de datos.
     *
     * @param servicio el objeto Servicio a guardar.
     */
    void saveServicio(Servicio servicio);

    /**
     * Actualiza un servicio existente en la base de datos.
     *
     * @param servicio el objeto Servicio con la información actualizada.
     */
    void updateServicio(Servicio servicio);

    /**
     * Elimina un servicio por su ID.
     *
     * @param id el ID del servicio a eliminar.
     */
    void deleteServicioById(Long id);
}
