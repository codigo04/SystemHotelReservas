package modelo.dao;
import modelo.entity.Habitacion;
/**
 *
 * @author Chris
 */
public interface HabitacionDao extends crud<Habitacion> {
    
    public void verificarEstado();
    
}
