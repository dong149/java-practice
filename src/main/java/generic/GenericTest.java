package generic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GenericTest {
    @Test
    void test() {
        String testString = "this is test";
        Integer testInteger = 10;
        GenericExample<Boolean> booleanType = new GenericExample<>(false);

        assertThat(GenericExample.isInteger(testString)).isEqualTo(false);
        assertThat(GenericExample.isInteger(testInteger)).isEqualTo(true);
        assertThat(GenericExample.get(testString)).isInstanceOf(String.class);
        assertThat(booleanType.getT()).isInstanceOf(Boolean.class);
    }
}
