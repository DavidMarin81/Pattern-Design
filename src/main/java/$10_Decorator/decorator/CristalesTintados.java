package $10_Decorator.decorator;

import $10_Decorator.ICoche;

public class CristalesTintados extends Decorador {

    public CristalesTintados(ICoche cocheDecorado) {
        super(cocheDecorado);
    }

    @Override
    public void conducir() {
        super.conducir();
        System.out.println("Con cristales tintados");
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 600;
    }
}
