package generic;

public class GenericExample<T> {

    private final T t;

    public GenericExample(T s) {
        this.t = s;
    }

    // static generic method
    // 클래스에 정의되어있는 T와 아래 T와는 별개다.
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
