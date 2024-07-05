package ch08.sec13;

public class SealedEx {
    public static void main(String[] args) {
        ImplClass implClass = new ImplClass();

        InterfaceA ia = implClass;
        ia.methodA();

        System.out.println();

        interfaceB ib = implClass;
        ib.methodA();
        ib.methodB();

        System.out.println();

        InterfaceC ic = implClass;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
