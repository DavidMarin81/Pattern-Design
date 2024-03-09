package $03_Abstract_Factory.model;

import $03_Abstract_Factory.ICharacter;

public class HumanWarrior implements ICharacter {
    @Override
    public String display() {
        return "Human Warrior";
    }
}
