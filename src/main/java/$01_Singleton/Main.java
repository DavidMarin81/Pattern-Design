package $01_Singleton;

public class Main {

    public static void main(String[] args) {

        //Se obtiene el objeto
        Conexion c = Conexion.getIntancia();

        if(c instanceof Conexion){
            System.out.println("Objeto de tipo Conexion");
            c.conectar();
            c.desconectar();
        }

    }
}
