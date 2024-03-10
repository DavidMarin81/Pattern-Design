package $11_Facade;

import $11_Facade.facade.SistemaGestionVuelos;

public class Main {
    public static void main(String[] args) {

        SistemaGestionVuelos vuelo1 = new SistemaGestionVuelos();
        vuelo1.reservarVuelo("Vigo", "Nueva York");

    }
}
