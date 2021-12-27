package nl.novi.javaprogrammeren.two;

public class Dog extends Animal{
    public Dog(String name, int amountOfLegs) {
        super(name, amountOfLegs);
    }

    @Override
    public void pet() {
        System.out.println("*Pets dog*... \n *WOOF*");

    }
}
