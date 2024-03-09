package $06_Builder.director;

import $06_Builder.IPizzaBuilder;
import $06_Builder.builder.SpicyPizzaBuilder;
import $06_Builder.model.Pizza;

public class Director {
    private IPizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(IPizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void construirPizza() {
        pizzaBuilder.crearMasa();
        pizzaBuilder.crearSalsa();
        pizzaBuilder.crearIngrediente();
    }
}
