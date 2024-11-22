/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import modelo.entity.Ticket;

/**
 *
 * @author FranDev
 */
public interface TicketDao {
    /**
     * Guarda un nuevo ticket en la base de datos.
     * @param ticket El objeto Ticket a guardar.
     * @return El ticket guardado.
     */
     Optional<Ticket> saveTicket(Ticket ticket);

    /**
     * Busca un ticket por su ID.
     * @param id El identificador del ticket.
     * @return Un Optional que contiene el ticket si existe, o vacío si no se encuentra.
     */
    Optional<Ticket> findById(int id);

    /**
     * Devuelve una lista de todos los tickets almacenados.
     * @return Una lista con todos los tickets.
     */
    List<Ticket> findAll();

    /**
     * Actualiza la información de un ticket existente.
     * @param id El identificador del ticket a actualizar.
     * @param ticket El objeto Ticket con los datos actualizados.
     * @return El ticket actualizado.
     */
    Optional<Ticket> updateTicket(int id, Ticket ticket);

    /**
     * Elimina un ticket de la base de datos por su ID.
     * @param idTicket El identificador del ticket.
     * @return true si se eliminó correctamente, false si no se encontró el ticket.
     */
    boolean deleteById(int idTicket);

    /**
     * Obtiene una lista de tickets generados en una fecha específica.
     * @param fecha La fecha de generación de los tickets.
     * @return Una lista de tickets generados en esa fecha.
     */
    List<Ticket> findByDate(LocalDate fecha);

    /**
     * Busca todos los tickets asociados a un cliente por su ID.
     * @param clienteId El identificador del cliente.
     * @return Una lista de tickets asociados al cliente.
     */
    List<Ticket> findByClienteId(int clienteId);

    /**
     * Obtiene el ticket más reciente generado en el sistema.
     * @return El ticket más reciente.
     */
    Optional<Ticket> findLatest();

    /**
     * Calcula el monto total de todos los tickets generados.
     * @return El monto total de los tickets.
     */
    Double calculateTotalAmount();
}
