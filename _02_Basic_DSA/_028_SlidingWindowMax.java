// _028_SlidingWindowMax.java
// Find the maximum in each sliding window of size k

import java.util.*;

public class _028_SlidingWindowMax {

    public static List<Integer> maxInSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of the current window
            while (!dq.isEmpty() && dq.peek() <= i - k)
                dq.poll();

            // Remove indices of smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.offer(i);

            // Start adding results from the k-th element
            if (i >= k - 1)
                result.add(nums[dq.peek()]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        List<Integer> maxList = maxInSlidingWindow(nums, k);

        System.out.println("Maximum in each window:");
        for (int max : maxList)
            System.out.print(max + " ");

        sc.close();
    }
}
