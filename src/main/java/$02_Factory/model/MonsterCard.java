package $02_Factory.model;

import $02_Factory.ICard;

public class MonsterCard implements ICard {
    @Override
    public String cardType() {
        return "Monstruo";
    }
}
