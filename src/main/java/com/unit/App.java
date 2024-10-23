package com.unit;

/**
 * Hello world!
 */

import controlador.ControladorPrincipal;
import controlador.ControladorEmpleado;
import controlador.ControladorLogin;
import controlador.pruebaCrolador;
import jakarta.persistence.*;
import modelo.dao.impl.ReservaImpl;
import modelo.entity.Product;
import vista.Administrador.JfrmAdministradorPrueba;

import vista.usuario;

public class App {

    public static void main(String[] args) {
        // Configuracion del EntityManagerFactory con el nombre de la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        // pruebaCrolador crolador = new pruebaCrolador(new usuario());
        
       // ControladorCliente contClient = new ControladorCliente(new usuario());
       
       ControladorLogin con = new ControladorLogin();
       con.correrLogin();
    }

}
