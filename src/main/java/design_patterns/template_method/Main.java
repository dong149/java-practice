package design_patterns.template_method;

public class Main {

    public static void main(String[] args) {
        AbstractSoldierConscription conscriptionStrategy = new NormalSoldierConscription();
        Soldier soldier = conscriptionStrategy.conscription();

        soldier.attack();
    }
}
