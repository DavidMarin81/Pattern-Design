package $10_Decorator.decorator;

import $10_Decorator.ICoche;

public class SistemaDeNavegacion extends Decorador{

    public SistemaDeNavegacion(ICoche coccheDecorado) {
        super(coccheDecorado);
    }

    @Override
    public void conducir() {
        super.conducir();
        System.out.println("Con sistema de navegación");
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 1500;
    }
}
