package modelo.entity;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Chris
 */
@Entity(name = "Servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicios;

    @ManyToMany(mappedBy = "servicios")
    private List<Reserva> reservas;

    private String nombreServicio;
    private Double precio;
    private String descripcion;
    private Boolean disponibilidad; 

    public Long getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(Long idServicios) {
        this.idServicios = idServicios;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
