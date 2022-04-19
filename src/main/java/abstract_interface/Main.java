package abstract_interface;

public class Main {

    public static void main(String[] args) {
        AbstractExample abstracted = new Abstracted();
        InterfaceExample implemented = new Implemented();

        abstracted.test();
        implemented.interfaceMethod1();
        implemented.interfaceMethod2();
    }
}
