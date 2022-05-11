package design_patterns.builder;

public class Main {

    public static void main(String[] args) {
        Computer computer = Computer.builder("mac", "x", "4GB")
                                    .setGood(true)
                                    .setNew(false)
                                    .build();

        System.out.println(computer.getName());
        System.out.println(computer.getHDD());
    }
}
