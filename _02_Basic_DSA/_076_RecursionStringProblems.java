// _076_RecursionStringProblems.java
public class _076_RecursionStringProblems {

    static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String word = "level";
        System.out.println("Reverse of 'hello': " + reverse("hello"));
        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome(word));
    }
}
