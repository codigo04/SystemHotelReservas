package com.unit;

/**
 * Hello world!
 */
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import controlador.pruebaCrolador;
import jakarta.persistence.*;
import modelo.entity.Product;

import vista.usuario;

public class App {

    public static void main(String[] args) {
        // Configuracion del EntityManagerFactory con el nombre de la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        pruebaCrolador crolador = new pruebaCrolador(new usuario());
    }

}
