/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.List;
import java.util.Optional;
import modelo.entity.TipoHabitacion;

/**
 *
 * @author FranDev
 */
public interface TipoHabitacionDao {

    // Guardar una nueva entidad TipoHabitacion en la base de datos
    void save(TipoHabitacion tipoHabitacion);

    // Actualizar una entidad existente en la base de datos
    void update(TipoHabitacion tipoHabitacion);

    // Eliminar una entidad TipoHabitacion por su ID
    void deleteById(Long idTipo);

    // Buscar una entidad TipoHabitacion por su ID, devuelve Optional
    Optional<TipoHabitacion> findById(Long idTipo);

    // Obtener todas las entidades TipoHabitacion
    List<TipoHabitacion> findAll();

    // Buscar todas las habitaciones que tengan un tipo específico, devuelve lista opcional
    Optional<TipoHabitacion> findByTipoHabitacion(String tipoHabitacion);

    // Buscar todas las habitaciones con un precio menor al valor dado, devuelve lista opcional
    Optional<List<TipoHabitacion>> findByPrecioLessThan(Double precio);

    // Buscar todas las habitaciones con un precio mayor o igual al valor dado, devuelve lista opcional
    Optional<List<TipoHabitacion>> findByPrecioGreaterThanEqual(Double precio);

    // Buscar todas las habitaciones que contengan una característica específica, devuelve lista opcional
    Optional<List<TipoHabitacion>> findByCaracteristicasContaining(String caracteristica);
}
