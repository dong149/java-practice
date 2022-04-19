package generic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GenericTest {
    @Test
    void test() {
        String testString = "this is test";
        Integer testInteger = 10;
        GenericClass<Boolean> booleanType = new GenericClass<>(false);

        assertThat(GenericClass.isInteger(testString)).isEqualTo(false);
        assertThat(GenericClass.isInteger(testInteger)).isEqualTo(true);
        assertThat(GenericClass.get(testString)).isInstanceOf(String.class);
        assertThat(booleanType.getT()).isInstanceOf(Boolean.class);
    }
}
