// _080_PermutationsRecursion.java
public class _080_PermutationsRecursion {

    static void generatePermutations(String str, String perm) {
        if (str.isEmpty()) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, perm + current);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        generatePermutations(input, "");
    }
}
