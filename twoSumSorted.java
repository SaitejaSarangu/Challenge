import java.util.Scanner;

public class TwoSumSorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();

        int[] result = twoSum(numbers, target);

        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found!");
        }

        scanner.close();
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0; // Start pointer
        int right = numbers.length - 1; // End pointer

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // Return the indices as 1-indexed, so add 1 to each
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                // Move the left pointer to the right to increase the sum
                left++;
            } else {
                // Move the right pointer to the left to decrease the sum
                right--;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}