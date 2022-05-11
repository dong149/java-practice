package design_patterns.proto_type;

public class PlusPen implements Product {

    private char plusChar;

    public PlusPen(char plusChar) {
        this.plusChar = plusChar;
    }

    @Override
    public void use(String s) {
        System.out.println(s + plusChar);
    }

    @Override
    public Product createClone() {
        Product p = null;

        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("error");
        }

        return p;
    }
}
