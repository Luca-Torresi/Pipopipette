package org.example.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.*;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    @Enumerated(EnumType.STRING)
    private TipoPromocion tipoPromocion;
    @ToString.Exclude
    @JoinTable(name = "promocion_articulo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articulo_id"))
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
    @OneToMany
    @JoinColumn(name="imagen-id")
    @Builder.Default
    private Set<Imagen> promoImagen = new HashSet<>();
}
