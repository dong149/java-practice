package design_patterns.factory_method;

public class IdCard extends Product {

    private String owner;

    public IdCard(String owner) {
        System.out.println(owner + "의 카드를 생성합니다!!");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용했습니다!!");
    }

    public String getOwner() {
        return owner;
    }
}
