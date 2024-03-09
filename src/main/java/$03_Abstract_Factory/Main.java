package $03_Abstract_Factory;

import $03_Abstract_Factory.abstractFactory.ICharacterFactory;
import $03_Abstract_Factory.factory.ElfFactory;
import $03_Abstract_Factory.factory.HumanFactory;

public class Main {
    public static void main(String[] args) {
        //Crear fabrica de humanos
        ICharacterFactory humanFactory = new HumanFactory();

        //Crear gerrero humano
        ICharacter humanWarrior = humanFactory.createWarrior();

        System.out.println("Se crea un " + humanWarrior.display());

        //Crear fabrica de elfon
        ICharacterFactory elfFactory = new ElfFactory();
        ICharacter elfMage = elfFactory.createMage();

        System.out.println("Se crea un " + elfMage.display());


    }
}
