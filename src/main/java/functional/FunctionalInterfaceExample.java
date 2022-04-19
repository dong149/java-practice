package functional;

@FunctionalInterface
public interface FunctionalInterfaceExample<T> {
    T get();

    // functional interface 에 지장을 주지 않는다.
    default String defaultMethod() {
        return "this is Default Method";
    }
}
