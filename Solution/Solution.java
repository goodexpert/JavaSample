import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("1과 9사이의 숫자를 입력하세요: ");
            num = scanner.nextInt();
            // 입력된 숫자가 1보다 작고, 9보다 크다면?
            if (num < 1 || num > 9)
                continue;

            for (int i = 1; i <= 9; i++) {
                System.out.format("%d x %d = %d\n", num, i, (num * i));
            }
            System.out.println("============================");
        } while (true);
    }
}
