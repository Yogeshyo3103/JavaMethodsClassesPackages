public class MethodsExample {

    // 1. Without parameters & without return value
    void sayHello() {
        System.out.println("Hello!");
    }

    // 2. With parameters & without return value
    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // 3. Without parameters & with return value
    int getNumber() {
        return 100;
    }

    // 4. With parameters & with return value
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodsExample obj = new MethodsExample();

        obj.sayHello();
        obj.greet("Yogesh");
        System.out.println("Number: " + obj.getNumber());
        System.out.println("Sum: " + obj.sum(10, 20));
    }
}
