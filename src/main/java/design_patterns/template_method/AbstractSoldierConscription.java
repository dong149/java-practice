package design_patterns.template_method;

public abstract class AbstractSoldierConscription {

    protected abstract Citizen conscriptionCitizen();

    protected abstract void training(Citizen citizen);

    protected abstract Soldier changeOfPosition(Citizen citizen);

    protected abstract void supplyEquipment(Soldier soldier);

    public Soldier conscription() {
        Citizen citizen = conscriptionCitizen();
        training(citizen);
        Soldier soldier = changeOfPosition(citizen);
        supplyEquipment(soldier);

        return soldier;
    }
}
