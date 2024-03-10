package $08_Bridge.model.forma;

import $08_Bridge.model.IColor;

public abstract class Forma {
    public IColor color;

    public Forma(IColor color) {
        this.color = color;
    }

    public abstract void dibujarForma();
}
