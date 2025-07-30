import java.util.ArrayList;

public class _000_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        // Add elements
        nums.add(10);
        nums.add(20);
        nums.add(30);

        // Display
        System.out.println("Initial List: " + nums);

        // Access and update
        System.out.println("Element at index 1: " + nums.get(1));
        nums.set(1, 25);  // update
        System.out.println("After update: " + nums);

        // Remove
        nums.remove(0);
        System.out.println("After removal: " + nums);

        // Size and check
        System.out.println("Size: " + nums.size());
        System.out.println("Contains 25? " + nums.contains(25));

        // Index
        System.out.println("Index of 25? " + nums.indexOf(25));

        // Clear
        nums.clear();
        System.out.println("Is empty? " + nums.isEmpty());
    }
}
