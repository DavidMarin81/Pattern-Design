package $08_Bridge.model.forma;

import $08_Bridge.model.IColor;

public class Circulo extends Forma{

    public Circulo(IColor color) {
        super(color);
    }

    @Override
    public void dibujarForma() {
        System.out.println("Dibujando un circulo");
        color.aplicarColor();
    }
}
