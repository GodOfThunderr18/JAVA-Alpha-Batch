package practiseques;

import java.util.Scanner;

public class kthLargestOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter L:");
        int L = sc.nextInt();
        System.out.println("Enter R:");
        int R = sc.nextInt();
        System.out.println("Enter k:");
        int k = sc.nextInt();

        if (L > R) {
            System.out.println("Invalid range: L should be less than or equal to R.");
            return;
        }
        if (k <= 0) {
            System.out.println("Invalid value of k: k should be greater than 0.");
            return;
        }

        int count = 0;
        for (int i = R; i >= L; i--) {
            if (i % 2 != 0) {
                count++;
            }
            if (count == k) {
                System.out.println("The " + k + "th largest odd number in the range is: " + i);
                return;
            }
        }

        // If we exit the loop without finding the kth odd number
        System.out.println("There are fewer than " + k + " odd numbers in the range [" + L + ", " + R + "].");
    }
}

