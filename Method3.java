package example;

public class Method3 {

    public static void main(String[] args) {
        MyInterface myInterface = ()-> System.out.println("Hello Method 3");
        myInterface.sayHello();
    }
}
