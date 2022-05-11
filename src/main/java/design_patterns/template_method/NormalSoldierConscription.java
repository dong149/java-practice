package design_patterns.template_method;

import design_patterns.strategy.Knife;

public class NormalSoldierConscription extends AbstractSoldierConscription {

    @Override
    protected Citizen conscriptionCitizen() {
        System.out.println("징집");
        return new Citizen();
    }

    @Override
    protected void training(Citizen citizen) {
        citizen.updateStrength(5);
        System.out.println("병사 훈련!");
    }

    @Override
    protected Soldier changeOfPosition(Citizen citizen) {
        System.out.println("시민 => 병사");
        return new Soldier(citizen);
    }

    @Override
    protected void supplyEquipment(Soldier soldier) {
        soldier.setWeapon(new Knife());
        System.out.println("장비 보급");
        soldier.getWeapon().attack();
    }
}
