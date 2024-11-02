package com.unit;

/**
 * Hello world!
 */
import com.formdev.flatlaf.FlatLightLaf;
import controlador.ControladorPrincipal;
import controlador.ControladorEmpleado;
import controlador.ControladorLogin;
import controlador.ControladorInicio;
import jakarta.persistence.*;
import javax.swing.UIManager;
import modelo.dao.impl.ReservaImpl;
import modelo.entity.Product;
import vista.Administrador.JfrmAdministradorPrueba;

import vista.usuario;

/**
 * Clase principal que configura la aplicación y ejecuta el proceso de login.
 */
public class App {

    /**
     * Método principal de la aplicación. Configura el EntityManagerFactory y
     * lanza el controlador de login.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("Button.arc", 20);
            UIManager.put("Componente.focusWidth", 0);
        } catch (Exception ex) {
            System.err.println("No se pudo establecer el Look and Feel.");
        }
        // Configuración del EntityManagerFactory con el nombre de la unidad de persistencia "myPU"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

        // Inicialización y ejecución del controlador de login
        ControladorLogin con = new ControladorLogin();
        con.correrLogin();

        // Ejemplos comentados de otros posibles controladores que podrían usarse en el futuro
        // pruebaControlador crolador = new pruebaControlador(new Usuario());
        // ControladorCliente contClient = new ControladorCliente(new Usuario());
    }
}
