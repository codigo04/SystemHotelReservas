package modelo.entity;

/**
 *
 * @author Chris
 */
import jakarta.persistence.*;
import java.util.List;
//import javax.persistence.Table;

@Entity(name = "TipoHabitacion")
public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipo;

    private String tipoHabitacion;
    private String caracteristicas;
    private Double precio;

    @OneToMany(mappedBy = "tipoHabitacion")
    private List<Habitacion> habitaciones;

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public List<Habitacion> getHabitacion() {
        return habitaciones;
    }

    public void setHabitacion(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
