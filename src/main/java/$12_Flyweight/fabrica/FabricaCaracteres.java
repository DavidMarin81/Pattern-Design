package $12_Flyweight.fabrica;

import $12_Flyweight.ICaracter;
import $12_Flyweight.model.CaracterCompartido;

import java.util.HashMap;
import java.util.Map;

public class FabricaCaracteres {

    private Map<Character, ICaracter> caracteres = new HashMap<>();

    public ICaracter getCaracter(char clave) {
        if(!caracteres.containsKey(clave)) {
            caracteres.put(clave, new CaracterCompartido(clave));
        }
        return caracteres.get(clave);
    }
}
