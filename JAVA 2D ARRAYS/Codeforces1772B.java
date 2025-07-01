import java.util.Scanner;

public class Codeforces1772B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            // Check for all four rotations
            if (isStrictlyIncreasing(a, b, c, d) ||
                isStrictlyIncreasing(c, a, d, b) ||
                isStrictlyIncreasing(d, c, b, a) ||
                isStrictlyIncreasing(b, d, a, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean isStrictlyIncreasing(int a, int b, int c, int d) {
        return a < b && a < c && c < d && b < d;
    }
}
