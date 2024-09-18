package modelo.entity;

import jakarta.persistence.*;
import java.util.List;
/**
 *
 * @author Chris
 */

@Entity (name = "Clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;
    
    //GETTER Y SETTER
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<Reserva> getIdReservas() {
        return reservas;
    }

    public void setIdReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    private String dni;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String celular;
}
