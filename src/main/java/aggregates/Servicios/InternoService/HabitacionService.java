/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregates.Servicios.InternoService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import modelo.dao.impl.HabitacionImpl;
import modelo.dao.impl.ReservaImpl;
import modelo.entity.Habitacion;
import modelo.entity.Reserva;
import modelo.entity.TipoHabitacion;

/**
 *
 * @author FranDev
 */
public class HabitacionService {

    private List<Reserva> reservas;  // Lista de habitaciones
    private ReservaImpl reservaImpl;
    private HabitacionImpl habitacionImpl;

    public HabitacionService(List<Reserva> reservas) {
        this.reservas = reservas;
        habitacionImpl = new HabitacionImpl();
        reservaImpl = new ReservaImpl();
    }

    // Método que se ejecutará periódicamente para revisar las habitaciones
    public void verificarYActualizarReservas() {
        // Obtener la fecha actual sin hora
        LocalDate fechaActual = LocalDate.now();

        for (Reserva reserva : reservas) {
            // Convertir la fecha de fin de la reserva de Timestamp a LocalDate
            LocalDate fechaFinReserva = reserva.getFechaFin().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();

            System.out.println("Las fechas que se están comprobando:");
            System.out.println("Fecha Actual: " + fechaActual);
            System.out.println("Fecha Fin Reserva: " + fechaFinReserva);

            if (fechaFinReserva.isBefore(fechaActual)) {
                // Verificar todas las reservas asociadas a la habitación
                Habitacion habitacion = reservaImpl.encontrarHabitacionDeReserva(reserva.getIdReserva());
                if (habitacion != null) {
                    List<Reserva> reservasHabitacion = reservaImpl.obtenerReservasPorHabitacion(habitacion.getIdHabitacion());

                    // Validar si hay reservas activas o futuras para esta habitación
                    boolean hayReservasActivas = reservasHabitacion.stream()
                            .anyMatch(r -> !r.getFechaFin().toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate().isBefore(fechaActual));

                    if (!hayReservasActivas) {
                        // Cambiar el estado de la habitación a "DISPONIBLE" solo si no hay reservas activas
                        habitacion.setEstado("DISPONIBLE");
                        habitacionImpl.updateHabitacion(habitacion);
                        System.out.println("La habitación " + habitacion.getNumeroDeHabitacion() + " ha sido desocupada.");
                    } else {
                        System.out.println("La habitación " + habitacion.getNumeroDeHabitacion() + " aún tiene reservas activas.");
                    }
                } else {
                    System.out.println("No se encontró una habitación asociada a la reserva con ID: " + reserva.getIdReserva());
                }
            } else {
                System.out.println("La reserva aún está activa. No se cambia el estado.");
            }
        }
    }

    /*
    public void updateHabitacion() {

        Habitacion dataNewHabitacion = panelHabitacionesAdm.datosUpdateHabitacion();

        Optional<Habitacion> habitacionExist = habitacionImpl.findHabitacionById(dataNewHabitacion.getIdHabitacion());

        if (habitacionExist.isPresent()) {
            Habitacion updateHabi = habitacionExist.get();

            updateHabi.setNumeroDeHabitacion(dataNewHabitacion.getNumeroDeHabitacion());
            updateHabi.setEstado(dataNewHabitacion.getEstado());

            Optional<TipoHabitacion> tipoHabitacion = tipoHabitacionImpl.findByTipoHabitacion(dataNewHabitacion.getTipoHabitacion().getTipoHabitacion());

            if (tipoHabitacion.isPresent()) {
                updateHabi.setTipoHabitacion(tipoHabitacion.get());
            }
            habitacionImpl.updateHabitacion(updateHabi);
        }

    }

     */
}
