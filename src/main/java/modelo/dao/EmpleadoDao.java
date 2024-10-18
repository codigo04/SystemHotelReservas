package modelo.dao;

import java.util.List;
import java.util.Optional;

import modelo.entity.Empleado;


/**
 * @author Chris
 */
public interface EmpleadoDao {

    // Obtener todos los empleados
    List<Empleado> getAllEmpleados();

    // Buscar un empleado por su ID
    Empleado findEmpleadoById(Long id);

    // Buscar un empleado por su nombre
    Empleado findEmpleadoByName(String name);
    
    // Buscar un empleado por su nombre
    Optional<Empleado> findEmpleadoByDni(String dni);

    // Guardar un nuevo empleado
    void saveEmpleado(Empleado empleado);

    // Actualizar un empleado existente
    void updateEmpleado(Empleado empleado);

    // Eliminar un empleado por su ID
    void deleteEmpleadoById(Long id);

    // Buscar empleados por su rol
    List<Empleado> findEmpleadosByRole(String role);
}
