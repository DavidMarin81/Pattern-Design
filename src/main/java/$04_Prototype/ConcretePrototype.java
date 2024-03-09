package $04_Prototype;

public class ConcretePrototype implements IPrototype{

    private String name;

    public ConcretePrototype(String name){
        this.name = name;
    }

    //Metodo para clonar el objeto
    @Override
    public IPrototype clone() {
        return new ConcretePrototype(this.name);
    }

    //Metodos para establecer y obtener el nombre (getter y setter)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
