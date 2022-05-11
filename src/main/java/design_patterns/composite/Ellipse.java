package design_patterns.composite;

/**
 * Leaf
 */
public class Ellipse implements Graphic{

    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}
