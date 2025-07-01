package SLidingwindow.FixedSize;

import java.util.*;

public class FirstNegativeNum {
    public static void main(String[] args) {
        int[] a = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int i = 0, j = 0;
        List<Integer> l = new ArrayList<>();

        while (j < a.length) {
            // Add negative number to list
            if (a[j] < 0) {
                l.add(a[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // Window has reached size k
                if (l.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(l.get(0) + " ");
                    // Remove if it's sliding out
                    if (a[i] == l.get(0)) {
                        l.remove(0);
                    }
                }
                //slide the window
                i++;
                j++;
            }
        }
    }
}
