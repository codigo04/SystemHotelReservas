package modelo.entity;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Chris
 */
@Entity (name = "Roles")
public class Roles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;
    
    //ESTABLECIENDO RELACION DE MUCHOS A MUCHOS
    @ManyToMany(mappedBy = "roles")
    private List<Empleado> usuarios;

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public List<Empleado> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Empleado> usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    
    @Column(name = "nombreRol")
    private String nombreRol;
    
}
