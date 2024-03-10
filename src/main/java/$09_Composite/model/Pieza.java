package $09_Composite.model;

import $09_Composite.IComponente;

public class Pieza implements IComponente {

    private String nombre;
    private double precio;

    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Pieza: " + nombre + ", Precio: " + precio);
    }
}
