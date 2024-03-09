package $03_Abstract_Factory.abstractFactory;

import $03_Abstract_Factory.ICharacter;

//Inteface para la fabrica de personajes (Abstract Factory)
public interface ICharacterFactory {
    ICharacter createWarrior();
    ICharacter createMage();
}
