package design_patterns.factory_method;

public class Main {

    public static void main(String[] args) {
        IdCardFactory factory = new IdCardFactory();

        Product card1 = factory.create("김상협");
        Product card2 = factory.create("류동훈");

        card1.use();
        card2.use();

        factory.printAllOwners();
    }
}
