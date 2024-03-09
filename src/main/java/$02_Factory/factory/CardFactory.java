package $02_Factory.factory;

import $02_Factory.ICard;
import $02_Factory.model.MonsterCard;
import $02_Factory.model.SpellCard;

public class CardFactory {
    public ICard createCard(String cardType) {
        if(cardType.equalsIgnoreCase("monstruo")) {
            return new MonsterCard();
        } else if(cardType.equalsIgnoreCase("hechizo")) {
            return new SpellCard();
        } else {
            return null;
        }
    }
}
