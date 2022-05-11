package design_patterns.abstract_factory;

public class Water extends Material {

    private String name;

    public Water(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
