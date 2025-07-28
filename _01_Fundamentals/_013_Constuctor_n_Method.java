//package Fundamentals;
public class _013_Constuctor_n_Method {

    // Constructor
    _013_Constuctor_n_Method() {
        System.out.println("Constructor called");
    }

    // Method
    void sayHello() {
        System.out.println("Hello from method");
    }

    public static void main(String[] args) {
        _013_Constuctor_n_Method s = new _013_Constuctor_n_Method(); // Constructor is called
        s.sayHello(); // Method is called
    }
}
