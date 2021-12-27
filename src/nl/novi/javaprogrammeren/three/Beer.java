package nl.novi.javaprogrammeren.three;

public class Beer {
    private static int numberOfBeers;
    private String brand;

    public Beer(String brand) {
        this.brand = brand;
        numberOfBeers++;
        System.out.println("Er is weer een biertje getapt!");
        System.out.println("Dit is biertje nummer" + numberOfBeers);
    }

    public static int getTappedBeersAmount(){
        return numberOfBeers;
    }
}
