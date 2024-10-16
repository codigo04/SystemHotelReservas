package modelo.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * @author Chris
 */

@Entity(name = "Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLLegada;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    private Double montoTotal;
    //RELACIONES ENTRE TABLAS
    @ManyToOne
    @JoinColumn(name = "idHabitacion")
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Empleado empleado;

    //RELACIONES DE MUCHOS A MUCHOS
    @ManyToMany
    @JoinTable(
            name = "Reserva_Servicios",
            joinColumns = @JoinColumn(name = "idReserva"),
            inverseJoinColumns = @JoinColumn(name = "idServicios")
    )
    private List<Servicio> servicios;

    //GETTER Y SETTER
    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getUsuario() {
        return empleado;
    }

    public void setUsuario(Empleado usuario) {
        this.empleado = usuario;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(Date fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }


}
