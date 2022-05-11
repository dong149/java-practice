package design_patterns.proto_type;

public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
