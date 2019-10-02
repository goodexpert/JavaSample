import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        /*
         * 문제 1,
         * 정수를 입력 받아서,
         * 양의 정수면, 양수라 출력하고,
         * 음의 정수면, 음수라 출력하시오.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하시오: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("양수");
        } else if (number < 0) {
            System.out.println("음수");
        }
    }
}
