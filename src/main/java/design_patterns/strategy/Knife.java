package design_patterns.strategy;

public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("this is Knife!!");
    }
}
