package $03_Abstract_Factory.factory;

import $03_Abstract_Factory.ICharacter;
import $03_Abstract_Factory.abstractFactory.ICharacterFactory;
import $03_Abstract_Factory.model.HumanMage;
import $03_Abstract_Factory.model.HumanWarrior;

public class HumanFactory implements ICharacterFactory {
    @Override
    public ICharacter createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public ICharacter createMage() {
        return new HumanMage();
    }
}
