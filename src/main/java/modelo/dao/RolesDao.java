package modelo.dao;
import modelo.entity.Roles;

import java.util.List;

/**
 *
 * @author Chris
 */
public interface RolesDao {

    // Método para obtener todos los roles
    List<Roles> getAllRoles();

    // Método para encontrar un rol por su id
    Roles findRoleById(Long id);

    // Método para encontrar un rol por su nombre
    Roles findRoleByName(String name);

    // Método para guardar un nuevo rol
    void saveRole(Roles role);

    // Método para actualizar un rol existente
    void updateRole(Roles role);

    // Método para eliminar un rol por su id
    void deleteRoleById(Long id);
                  
}
