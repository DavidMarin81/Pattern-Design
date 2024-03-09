package $06_Builder;

import $06_Builder.model.Pizza;

public interface IPizzaBuilder {
    void crearMasa();
    void crearSalsa();
    void crearIngrediente();
    Pizza getPizza();
}
