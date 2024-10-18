package modelo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPago;
    Date fechaPago;

    Double montoPago;

    boolean estadoPago;

    String metodoPago;
}
