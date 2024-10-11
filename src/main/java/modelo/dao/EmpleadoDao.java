package modelo.dao;

import java.util.List;
import modelo.entity.Empleado;



/**
 *
 * @author Chris
 */
public interface EmpleadoDao extends crud<Empleado>{
       
    List<Empleado> findAllEmpleados();
}
