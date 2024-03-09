package $03_Abstract_Factory.model;

import $03_Abstract_Factory.ICharacter;

public class HumanMage implements ICharacter {
    @Override
    public String display() {
        return "Human Mage";
    }
}
