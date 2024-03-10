package $08_Bridge.model;

import $08_Bridge.model.color.Rojo;
import $08_Bridge.model.color.Verde;
import $08_Bridge.model.forma.Circulo;
import $08_Bridge.model.forma.Cuadrado;
import $08_Bridge.model.forma.Forma;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        IColor rojo = new Rojo();
        IColor verde = new Verde();

        Forma cuadrado = new Cuadrado(rojo);
        Forma circulo = new Circulo(verde);

        cuadrado.dibujarForma();
        circulo.dibujarForma();

    }

}
