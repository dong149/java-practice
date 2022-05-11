package design_patterns.template_method;

import design_patterns.strategy.Weapon;

public class Soldier extends Citizen {

    private Weapon weapon;

    public void attack() {
        this.weapon.attack();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Soldier(Citizen citizen) {
        super(citizen);
    }
}
