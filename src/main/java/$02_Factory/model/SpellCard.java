package $02_Factory.model;

import $02_Factory.ICard;

public class SpellCard implements ICard {
    @Override
    public String cardType() {
        return "Hechizo";
    }
}
