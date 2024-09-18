package modelo.entity;

import jakarta.persistence.*;
import java.util.List;
/**
 *
 * @author Chris
 */

@Entity (name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuarios;
    
    @OneToMany(mappedBy = "usuario")
    private List<Reserva> reservas;
    
    //RELACION DE MUCHOS A MUCHOS CON LA TABLA Roles
    @ManyToMany
    @JoinTable(
        name = "Usuario_Roles",
        joinColumns = @JoinColumn(name = "idUsuario"),
        inverseJoinColumns = @JoinColumn(name = "idRol")
    )
    private List<Roles> roles;
    
    //GETTER Y SETTER
    public Long getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Long idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    private String dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correoElectronico;
    private String usuario;
    private String clave;
    
}
