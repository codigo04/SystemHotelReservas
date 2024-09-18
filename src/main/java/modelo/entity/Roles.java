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
    private List<Usuario> usuarios;

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
     
    private String nombreRol;
    
}
