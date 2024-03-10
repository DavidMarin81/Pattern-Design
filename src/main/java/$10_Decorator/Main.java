package $10_Decorator;

import $10_Decorator.decorator.AsientosDeCuero;
import $10_Decorator.decorator.CristalesTintados;
import $10_Decorator.decorator.SistemaDeNavegacion;
import $10_Decorator.model.CocheBasico;

public class Main {
    public static void main(String[] args) {

        ICoche coche = new CocheBasico();
        System.out.println("Precio del coche basico: " + coche.getPrecio());

        coche = new SistemaDeNavegacion(coche);
        System.out.println("Precio con sistema de navegacion: " + coche.getPrecio());

        coche = new AsientosDeCuero(coche);
        System.out.println("Precio con asientos de cuero: " + coche.getPrecio());

        coche = new CristalesTintados(coche);
        System.out.println("Precio con cristales tintados: " + coche.getPrecio());

        coche.conducir();

    }
}
