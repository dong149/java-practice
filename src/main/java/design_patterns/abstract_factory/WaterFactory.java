package design_patterns.abstract_factory;

public class WaterFactory extends AbstractFactory {

    private static final String WATER_NAME = "water";

    @Override
    public Material createMaterial() {
        return new Water(WATER_NAME);
    }
}
