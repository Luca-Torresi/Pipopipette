package org.example.Entidades;

import lombok.*;
import java.util.*;
import jakarta.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "unidad_id")
    private UnidadMedida unidadMedida;

    @OneToOne
    @JoinColumn(name = "imagen_id")
    private Imagen imagen;

    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();
}

