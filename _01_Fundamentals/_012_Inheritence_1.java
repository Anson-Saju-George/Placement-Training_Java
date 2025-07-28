//package Fundamentals;
public class _012_Inheritence_1 {

    public int fun() {
        System.out.println("Hello");
        return 100;
    }

    // Check Student.java
    public static void main(String[] args) {
        _012_Inheritence_1 m = new _012_Inheritence_1();
        Student s = new Student(); // Assuming Student class is defined elsewhere
        int ans = m.fun();
        System.out.println(ans);
        s.person();
    }
}
