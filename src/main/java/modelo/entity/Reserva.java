package modelo.entity;

import java.sql.Timestamp;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * @author Chris
 */
@Entity(name = "Reserva")
@Table
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    
    private String codigoReserva;
    
    private String estado;
   
    private Timestamp fechaRegistro;

    
    private Timestamp fechaLLegada;

    private Integer numeroHuespedes;
   
    private Timestamp fechaFin;

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

    @OneToMany(mappedBy = "reserva")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "reserva")
    private List<Pago> pagos;

    //GETTER Y SETTER
    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Timestamp getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(Timestamp fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public Integer getNumeroHuespedes() {
        return numeroHuespedes;
    }

    public void setNumeroHuespedes(Integer numeroHuespedes) {
        this.numeroHuespedes = numeroHuespedes;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
    
    
    
}
