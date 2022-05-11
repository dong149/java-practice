package design_patterns.proto_type;

public class UnderlinePen implements Product {

    private char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String s) {
        System.out.println(s + underlineChar);
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
