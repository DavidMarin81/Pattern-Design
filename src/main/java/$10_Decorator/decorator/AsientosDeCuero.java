package $10_Decorator.decorator;

import $10_Decorator.ICoche;

public class AsientosDeCuero extends Decorador {

    public AsientosDeCuero(ICoche cocheDecorado) {
        super(cocheDecorado);
    }

    @Override
    public void conducir() {
        super.conducir();
        System.out.println("Con asientos de cuero");
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 2000;
    }
}
