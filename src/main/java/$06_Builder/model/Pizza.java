package $06_Builder.model;

public class Pizza {
    private String masa;
    private String salsa;
    private String ingrediente;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void displayPizza() {
        System.out.println("Pizza:\n" +
                "\tMasa: " + this.masa +
                "\tSalsa: " + this.salsa +
                "\tIngrediente: " + this.ingrediente);
    }
}
