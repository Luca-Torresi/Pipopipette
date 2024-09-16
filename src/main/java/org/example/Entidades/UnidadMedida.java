package org.example.Entidades;

import lombok.*;
import java.util.HashSet;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class UnidadMedida {
    private Long id;
    private String denominacion;
    @Builder.Default
    private HashSet<Articulo> articulos = new HashSet<>();


}

