package nl.novi.javaprogrammeren.two;

public abstract class Animal {

    private int amountOfLegs;
    private String name;

    public Animal(String name, int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
        this.name = name;
    }
    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public String getName() {
        return name;
    }

    public abstract void pet();
}
