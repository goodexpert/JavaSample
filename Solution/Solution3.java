import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String pattern = "*";

        String input = scanner.next();
        /// input = "aaaa", length = 4

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            //System.out.format("%s\n", pattern);
            // System.out.format("%10s\n", pattern);
            System.out.format(String.format("%%%ds\n", n), pattern);
            pattern += "*";

            /*
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
            */
        }
    }
}
