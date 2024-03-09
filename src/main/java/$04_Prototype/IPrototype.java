package $04_Prototype;

public interface IPrototype {
    IPrototype clone();
    void setName(String name);
    String getName();
}
