package _00_Programming;

public class Variables_N_Data_Types {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;
        String e = "Hello, World!";

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + e);
        String s1 = "hello";
        String s2 = s1;

        s2 = "world";

        System.out.println(s1);
        System.out.println(s2);
    }
}
