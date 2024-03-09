package $03_Abstract_Factory.factory;

import $03_Abstract_Factory.ICharacter;
import $03_Abstract_Factory.abstractFactory.ICharacterFactory;
import $03_Abstract_Factory.model.ElfMage;
import $03_Abstract_Factory.model.ElfWarrior;

public class ElfFactory implements ICharacterFactory {
    @Override
    public ICharacter createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public ICharacter createMage() {
        return new ElfMage();
    }
}
