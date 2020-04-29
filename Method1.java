package example;

public class Method1 implements MyInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello Method 1");
    }

    public static void main(String[] args) {
        Method1 method1 = new Method1();
        method1.sayHello();
    }
}
