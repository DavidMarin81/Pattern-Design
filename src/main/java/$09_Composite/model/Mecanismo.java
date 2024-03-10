package $09_Composite.model;

import $09_Composite.IComponente;

import java.util.ArrayList;
import java.util.List;

public class Mecanismo implements IComponente {

    private String nombre;
    private List<IComponente> componentes = new ArrayList<>();

    public Mecanismo(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(IComponente componente) {
        componentes.add(componente);
    }

    public void eliminar(IComponente componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Mecanismos: " + nombre);
        for(IComponente c : componentes) {
            c.mostrarInformacion();
        }
    }
}
