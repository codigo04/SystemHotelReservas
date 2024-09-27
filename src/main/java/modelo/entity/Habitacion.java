package modelo.entity;

import jakarta.persistence.*;
import java.util.List;
/**
 *
 * @author Chris
 */

@Entity(name = "Habitacion")
public class Habitacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabitacion;
    
    //RELACION CON LA TABLA TipoHabitacion
    @ManyToOne
    @JoinColumn(name = "idTipo")
    private TipoHabitacion tipoHabitacion;
    
    @OneToMany(mappedBy = "habitacion")
    private List<Reserva> reservas;
    
    //GETTER Y SETTER
    public Long getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Long idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public List<Reserva> getIdReserva() {
        return reservas;
    }

    public void setIdReserva(List<Reserva> idReserva) {
        this.reservas = idReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private String estado;
    private int codigo;
}
