package org.example.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Promocion {
    private Long id;
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion TipoPromocion;
}
