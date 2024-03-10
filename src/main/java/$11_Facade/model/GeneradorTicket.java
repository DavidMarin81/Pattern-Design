package $11_Facade.model;

public class GeneradorTicket {

    public void generarTicket(String origen, String destino) {
        System.out.println("Ticket generado para vuelo de: " +
                "\n\tOrigen: " + origen +
                "\n\tDestino: " + destino);
    }
}
