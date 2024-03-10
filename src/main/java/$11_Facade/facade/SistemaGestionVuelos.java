package $11_Facade.facade;

import $11_Facade.model.DisponibilidadVuelos;
import $11_Facade.model.GeneradorTicket;
import $11_Facade.model.ReservarVuelos;

public class SistemaGestionVuelos {

    private ReservarVuelos reservarVuelos;
    private DisponibilidadVuelos disponibilidadVuelos;
    private GeneradorTicket generadorTicket;

    public SistemaGestionVuelos() {
        this.reservarVuelos = new ReservarVuelos();
        this.disponibilidadVuelos = new DisponibilidadVuelos();
        this.generadorTicket = new GeneradorTicket();
    }

    public void reservarVuelo(String origen, String destino) {
        if(disponibilidadVuelos.verificarDisponibildad(origen, destino)) {
            reservarVuelos.reservarVuelos(origen, destino);
            generadorTicket.generarTicket(origen, destino);
        } else {
            System.out.println("No hay disponibilidad");
        }
    }
}
