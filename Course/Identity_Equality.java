package Course;

public class Identity_Equality {
    int a;
    public Identity_Equality(int a) {
        this.a = a;
        System.out.println("A constructor called with value: " + a);
    }
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
