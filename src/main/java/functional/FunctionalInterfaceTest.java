package functional;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FunctionalInterfaceTest {
    public static <T> T supplierParameter(FunctionalInterfaceExample<T> supplier) {
        return supplier.get();
    }

    @Test
    void test() {
        int i = 5;
        FunctionalInterfaceExample<Integer> supplier = () -> i*i;
        assertThat(FunctionalInterfaceTest.supplierParameter(supplier)).isEqualTo(i*i);
    }
}
