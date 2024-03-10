package $12_Flyweight;

import $12_Flyweight.fabrica.FabricaCaracteres;

public class Main {
    public static void main(String[] args) {
        FabricaCaracteres fabrica = new FabricaCaracteres();

        //Obtenemops caracteres compartidos
        ICaracter a = fabrica.getCaracter('a');
        ICaracter b = fabrica.getCaracter('b');
        ICaracter c = fabrica.getCaracter('c');

        //Mostramos los caracteres con diferentes tamaños
        a.mostrar(10);
        b.mostrar(12);
        c.mostrar(14);

    }
}
