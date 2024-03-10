package $09_Composite;

import $09_Composite.model.Mecanismo;
import $09_Composite.model.Pieza;

public class Main {
    public static void main(String[] args) {

        //Creacion de componentes
        Pieza motor = new Pieza("Motor", 1500);
        Pieza llantas = new Pieza("Llantas", 300);
        Pieza faros = new Pieza("Faros", 200);

        //Creacion de grupos de componentes
        Mecanismo carroceria = new Mecanismo("Carroceria");
        carroceria.agregar(new Pieza("Puerta", 600));
        carroceria.agregar(new Pieza("Techo", 600));

        Mecanismo interior = new Mecanismo("Interior");
        interior.agregar(new Pieza("Asientos", 800));
        interior.agregar(new Pieza("Volante", 200));

        Mecanismo coche = new Mecanismo("Coche");
        coche.agregar(motor);
        coche.agregar(llantas);
        coche.agregar(faros);
        coche.agregar(carroceria);
        coche.agregar(interior);

        //Mostrar informacion del coche
        coche.mostrarInformacion();

    }
}
