package $06_Builder;

import $06_Builder.builder.HawaiianPizzaBuilder;
import $06_Builder.builder.SpicyPizzaBuilder;
import $06_Builder.director.Director;
import $06_Builder.model.Pizza;

public class Main {
    public static void main(String[] args) {
        //Se crea el responsable de crear la pizza
        Director director = new Director();

        //Creamos un constructor concreto para una pizza hawaiana
        IPizzaBuilder pizzaHawaiana = new HawaiianPizzaBuilder();

        //Establecemos el constructor concreto en el Director
        director.setPizzaBuilder(pizzaHawaiana);

        //Construimos una pizza utilizando el constructor establecido
        director.construirPizza();

        //Obtenemos la pizza construida
        Pizza pizza = director.getPizza();

        //Mostramos los detalles de la pizza construida
        pizza.displayPizza();

        //Lo mismo para otro tipo de pizza
        IPizzaBuilder pizzaPicante = new SpicyPizzaBuilder();
        director.setPizzaBuilder(pizzaPicante);
        director.construirPizza();

        Pizza pizza2 = director.getPizza();
        pizza2.displayPizza();

    }
}
