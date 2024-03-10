package $08_Bridge.model.forma;

import $08_Bridge.model.IColor;

public class Cuadrado extends Forma{

    public Cuadrado(IColor color) {
        super(color);
    }

    @Override
    public void dibujarForma() {
        System.out.println("Dibujando un cuadrado");
        color.aplicarColor();
    }
}
