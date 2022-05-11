package design_patterns.factory_method;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory{
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        System.out.println("owner 등록");
        owners.add(((IdCard)p).getOwner());
    }

    public void printAllOwners() {
        owners.forEach(System.out::println);
        System.out.println("전체 owners 출력완료");
    }
}
