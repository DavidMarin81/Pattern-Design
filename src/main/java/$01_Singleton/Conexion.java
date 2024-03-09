package $01_Singleton;

public class Conexion {

    //Hay dos opciones de instanciar el objeto
    // 1.- Se crea un objeto de singleton y se instancia
    private static Conexion instancia = new Conexion();

    /* 2.- Puedes preferir que no se instancie el objeto hasta que se solicite por primera vez
    Esto se llama "Lazy initialization" */
    //2.1.- private static Conexion instancia;
    //2.2.- private static Conexion instancia = null;

    //Constructor privado para evitar su intanciacion
    private Conexion() {

    }

    //Devuelve el objeto unico
    public static Conexion getIntancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conectado a la BBDD");
    }

    public void desconectar () {
        System.out.println("Desconectado de la BBDD");
    }


}
