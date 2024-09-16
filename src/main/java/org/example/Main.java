package org.example;

import org.example.Entidades.*;
import java.util.ArrayList;
import lombok.*;

public class Main{
    public static void main(String[] args) {

        //UNIDADES DE MEDIDA
        UnidadMedida unidad1 = UnidadMedida.builder()
                .denominacion("8 porciones")
                .build();

        UnidadMedida unidad2 = UnidadMedida.builder()
                .denominacion("4 porciones")
                .build();

        UnidadMedida unidad3 = UnidadMedida.builder()
                .denominacion("1 litro")
                .build();

        //IMAGENES
        Imagen imagen1 = Imagen.builder()
                .denominacion("Pizza grande Hawaiana")
                .build();

        Imagen imagen2 = Imagen.builder()
                .denominacion("Pizza grande Napolitana")
                .build();

        Imagen imagen3 = Imagen.builder()
                .denominacion("Pizza grande Muzza")
                .build();

        Imagen imagen4 = Imagen.builder()
                .denominacion("Pizza chica Hawaiana")
                .build();

        Imagen imagen5 = Imagen.builder()
                .denominacion("Pizza chica Napolitana")
                .build();

        Imagen imagen6 = Imagen.builder()
                .denominacion("Pizza chica Muzza")
                .build();

        Imagen imagen7 = Imagen.builder()
                .denominacion("Cerveza Andes")
                .build();

        Imagen imagen8 = Imagen.builder()
                .denominacion("Cerveza Quilmes")
                .build();


        //PROMOCIONES
        Promocion imahappy1 = Promocion.builder()
                .denominacion("Happy Hour")
                .build();

        Promocion imahappy2 = Promocion.builder()
                .denominacion("Happy Hour")
                .build();

        Promocion verano1 = Promocion.builder()
                .denominacion("Verano")
                .build();

        Promocion verano2 = Promocion.builder()
                .denominacion("Verano")
                .build();

        Promocion invierno1 = Promocion.builder()
                .denominacion("Invierno")
                .build();

        Promocion invierno2 = Promocion.builder()
                .denominacion("Invierno")
                .build();


        //ARTICULOS
        Articulo pizzaGrandeH = Articulo.builder()
                .denominacion("Pizza grande Hawaiana")
                .imagen(imagen1)
                .build();

        Articulo pizzaChicaH = Articulo.builder()
                .denominacion("Pizza chica Hawaiana")
                .imagen(imagen4)
                .build();

        Articulo pizzaGrandeN = Articulo.builder()
                .denominacion("Pizza grande Napolitanta")
                .imagen(imagen2)
                .build();

        Articulo pizzaChicaN = Articulo.builder()
                .denominacion("Pizza chica Napolitanta")
                .imagen(imagen5)
                .build();

        Articulo pizzaGrandeM = Articulo.builder()
                .denominacion("Pizza grande Muzza")
                .imagen(imagen3)
                .build();

        Articulo pizzaChicaM = Articulo.builder()
                .denominacion("Pizza chica Muzza")
                .imagen(imagen6)
                .build();

        Articulo cerveza1 = Articulo.builder()
                .denominacion("Cerveza Andes")
                .imagen(imagen7)
                .build();

        Articulo cerveza2 = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .imagen(imagen8)
                .build();

        imahappy1.getArticulos().add(pizzaGrandeH);
        imahappy1.getArticulos().add(pizzaGrandeM);
        imahappy1.getArticulos().add(cerveza2);
        imahappy1.getPromoImagen().add(pizzaGrandeH.getImagen());
        imahappy1.getPromoImagen().add(pizzaGrandeM.getImagen());
        imahappy1.getPromoImagen().add(cerveza2.getImagen());
        
        verano1.getArticulos().add(pizzaChicaH);
        verano1.getArticulos().add(pizzaGrandeN);
        verano1.getArticulos().add(cerveza1);
        verano1.getArticulos().add(cerveza2);
        verano1.getPromoImagen().add(pizzaChicaH.getImagen());
        verano1.getPromoImagen().add(pizzaGrandeN.getImagen());
        verano1.getPromoImagen().add(cerveza1.getImagen());
        verano1.getPromoImagen().add(cerveza2.getImagen());

        invierno1.getArticulos().add(pizzaGrandeH);
        invierno1.getArticulos().add(pizzaChicaM);
        invierno1.getArticulos().add(cerveza2);
        invierno1.getPromoImagen().add(pizzaGrandeH.getImagen());
        invierno1.getPromoImagen().add(pizzaChicaM.getImagen());
        invierno1.getPromoImagen().add(cerveza2.getImagen());


    }
}