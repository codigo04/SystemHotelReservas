package modelo.dao;

import modelo.entity.Cliente;

import java.util.List;

/**
 *
 * @author Chris
 */
public interface ClienteDao {

    // Obtener todos los clientes
    List<Cliente> getAllClientes();

    // Buscar un cliente por su ID
    Cliente findClienteById(Long id);

    // Buscar un cliente por su nombre
    Cliente findClienteByName(String name);

    // Guardar un nuevo cliente
    Cliente saveCliente(Cliente cliente);

    // Actualizar un cliente existente
    void updateCliente(Cliente cliente);

    // Eliminar un cliente por su ID
    void deleteClienteById(Long id);

    // Buscar clientes por email
    Cliente findClienteByEmail(String email);

}
