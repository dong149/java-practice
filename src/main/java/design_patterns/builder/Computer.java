package design_patterns.builder;

public class Computer {

    private String name;
    private String HDD;
    private String RAM;

    private boolean isNew;
    private boolean isGood;

    public String getName() {
        return name;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isNew() {
        return isNew;
    }

    public boolean isGood() {
        return isGood;
    }

    private Computer(ComputerBuilder builder) {
        this.name = builder.name;
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;

        this.isNew = builder.isNew;
        this.isGood = builder.isGood;
    }

    public static ComputerBuilder builder(String name, String HDD, String RAM) {
        return new ComputerBuilder(name, HDD, RAM);
    }

    public static class ComputerBuilder {

        private String name;
        private String HDD;
        private String RAM;

        private boolean isNew;
        private boolean isGood;

        public ComputerBuilder(String name, String HDD, String RAM) {
            this.name = name;
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setNew(boolean aNew) {
            isNew = aNew;
            return this;
        }

        public ComputerBuilder setGood(boolean good) {
            isGood = good;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
