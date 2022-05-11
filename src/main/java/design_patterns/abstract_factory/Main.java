package design_patterns.abstract_factory;

public class Main {

    public static void main(String[] args) {
        // Factory 를 선택해서 넣어주면, 그때마다 다른 객체를 생성한다.
        Material material = Factory.getMaterial(new WaterFactory());

        System.out.println(material.getName()); // water
    }
}
