package $10_Decorator.decorator;


import $10_Decorator.ICoche;

public abstract class Decorador implements ICoche {
    public ICoche cocheDecorado;

    public Decorador(ICoche cocheDecorado) {
        this.cocheDecorado = cocheDecorado;
    }

    @Override
    public void conducir() {
        cocheDecorado.conducir();
    }

    @Override
    public double getPrecio() {
        return cocheDecorado.getPrecio();
    }
}
