package $04_Prototype;

public class Main {
    public static void main(String[] args) {

        //Se crea un prototipo
        IPrototype original = new ConcretePrototype("Prototipo original");

        //Se clona el prototipo
        IPrototype clonado = original.clone();
        clonado.setName("Prototipo clonado");

        System.out.println("Nombre del prototipo original: " + original.getName());
        System.out.println("Nombre del prototipo clonado: " + clonado.getName());

    }
}
