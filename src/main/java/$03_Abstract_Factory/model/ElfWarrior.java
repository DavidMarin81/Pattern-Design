package $03_Abstract_Factory.model;

import $03_Abstract_Factory.ICharacter;

public class ElfWarrior implements ICharacter {
    @Override
    public String display() {
        return "Elf Warrior";
    }
}
