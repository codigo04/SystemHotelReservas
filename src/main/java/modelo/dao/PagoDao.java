/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import modelo.entity.Pago;

/**
 *
 * @author FranDev
 */
public interface PagoDao {

    Optional<List<Pago>> findPagosByEstadoPago(String estadoPago);

    Optional<List<Pago>> findPagosByFechaPago(Date fechaPago);

    Optional<List<Pago>> findPagosByMetodoPago(String metodoPago);

    Optional<List<Pago>> findPagosBetweenFechas(Date startDate, Date endDate);

    Optional<List<Pago>> findPagosByReservaId(Long idReserva);

    Double obtenerMontoTotalPagado();
    
    Optional<Pago> savePago(Pago pago);
    
    Optional<Pago> editPago(int idPago,Pago pago);
}
