package generic;

public class GenericClass<T> {

    private final T t;

    public GenericClass(T s) {
        this.t = s;
    }

    // static generic method
    public static <T> boolean isInteger(T t) {
        return t instanceof Integer;
    }

    public static <T> T get(T t) {
        return t;
    }

    // generic method
    public T getT() {
        return t;
    }
}
