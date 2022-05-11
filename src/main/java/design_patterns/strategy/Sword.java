package design_patterns.strategy;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("this is Sword!");
    }
}
