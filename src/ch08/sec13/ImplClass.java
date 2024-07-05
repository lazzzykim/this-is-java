package ch08.sec13;

public class ImplClass implements InterfaceC {
    @Override
    public void methodC() {
        System.out.println("ImplClass.methodC");
    }

    @Override
    public void methodB() {
        System.out.println("ImplClass.methodB");
    }

    @Override
    public void methodA() {
        System.out.println("ImplClass.methodA");
    }
}
