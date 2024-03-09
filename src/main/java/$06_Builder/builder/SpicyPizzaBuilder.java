package $06_Builder.builder;

import $06_Builder.IPizzaBuilder;
import $06_Builder.model.Pizza;

public class SpicyPizzaBuilder implements IPizzaBuilder {
    private Pizza pizza;

    public SpicyPizzaBuilder() {
        pizza = new Pizza();
    }


    @Override
    public void crearMasa() {
        pizza.setMasa("Integral");
    }

    @Override
    public void crearSalsa() {
        pizza.setSalsa("Picante");
    }

    @Override
    public void crearIngrediente() {
        pizza.setIngrediente("Pepperoni y Jalapeños");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
