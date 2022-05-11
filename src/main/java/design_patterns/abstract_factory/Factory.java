package design_patterns.abstract_factory;

public class Factory {
    public static Material getMaterial(AbstractFactory factory) {
        return factory.createMaterial();
    }
}
