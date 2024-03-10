package $10_Decorator.model;

import $10_Decorator.ICoche;

public class CocheBasico implements ICoche {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche basico");
    }

    @Override
    public double getPrecio() {
        return 10000;
    }
}
