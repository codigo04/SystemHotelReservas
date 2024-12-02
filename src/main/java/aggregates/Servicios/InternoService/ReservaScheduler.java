/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregates.Servicios.InternoService;

import controlador.ControladorHabitaciones;
import controlador.ControladorTipoHabitaciones;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author FranDev
 */
public class ReservaScheduler {

    private static final int INTERVALO_MINUTOS = 1;  // Cada cuánto se verifica el estado (en minutos)

    private HabitacionService habitacionService; // Servicio donde se maneja la lógica de actualización

    private ControladorHabitaciones controladorHabitaciones;

    public ReservaScheduler(HabitacionService habitacionService) {
        this.habitacionService = habitacionService;

      

    }

    public void iniciarTareaProgramada() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        // Ejecutar la tarea periódicamente (cada 1 minuto)
        scheduler.scheduleAtFixedRate(() -> {
            habitacionService.verificarYActualizarReservas();
        }, 0, INTERVALO_MINUTOS, TimeUnit.MINUTES);
    }
}
