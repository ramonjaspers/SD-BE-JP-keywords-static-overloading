package nl.novi.javaprogrammeren.two;

public class MainTwo {

    public static void main(String[] args) {
    Dog henry = new Dog("henry", 4);
        System.out.println(henry.getName());
        System.out.println(henry.getAmountOfLegs());
        henry.pet();
    }
}
