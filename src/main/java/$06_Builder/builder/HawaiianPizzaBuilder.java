package $06_Builder.builder;

import $06_Builder.IPizzaBuilder;
import $06_Builder.model.Pizza;

public class HawaiianPizzaBuilder implements IPizzaBuilder {

    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        pizza = new Pizza();
    }
    @Override
    public void crearMasa() {
        pizza.setMasa("Normal");
    }

    @Override
    public void crearSalsa() {
        pizza.setSalsa("Tomate");
    }

    @Override
    public void crearIngrediente() {
        pizza.setIngrediente("Jamón y piña");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

}
