package $12_Flyweight.model;

import $12_Flyweight.ICaracter;

public class CaracterCompartido implements ICaracter {

    private char simbolo;

    public CaracterCompartido(char simbolo) {
        this.simbolo = simbolo;
    }


    @Override
    public void mostrar(int tamaño) {
        System.out.println("Caracter compartido: " + simbolo +
                " con tamaño: " + tamaño);
    }
}
