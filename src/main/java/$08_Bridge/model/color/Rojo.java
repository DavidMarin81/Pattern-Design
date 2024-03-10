package $08_Bridge.model.color;

import $08_Bridge.model.IColor;

public class Rojo implements IColor {
    @Override
    public void aplicarColor() {
        System.out.println("Aplicando color rojo");
    }
}
