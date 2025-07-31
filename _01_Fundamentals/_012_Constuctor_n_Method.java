//package Fundamentals;
public class _012_Constuctor_n_Method {

    // Constructor
    _012_Constuctor_n_Method() {
        System.out.println("Constructor called");
    }

    // Method
    void sayHello() {
        System.out.println("Hello from method");
    }

    public static void main(String[] args) {
        _012_Constuctor_n_Method s = new _012_Constuctor_n_Method(); // Constructor is called
        s.sayHello(); // Method is called

        // Creating object of Student class and calling person() method
        Student st = new Student();
        st.person();
    }
}


// Note:- Might require compiling in the current dir
//
// ~ Terminal
// Placement-Training_Java/Fundamentals on  main 
// ➜ javac _012_Constuctor_n_Method.java Student.java
// 
// 
// Placement-Training_Java/Fundamentals on  main 
// ➜ java _012_Constuctor_n_Method
// 
// Constructor called
// Hello from method
// Hiiii
// 
// Placement-Training_Java/Fundamentals on  main 
// ➜ 