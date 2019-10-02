import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        /*
         * 문제 2,
         * 성별을 입력 받아,
         * M이면 남성이라 출력하고,
         * F이면 여성이라 출력하시오.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("성별을 입력하시오: ");

        String line = scanner.next();
        char gender = line.toUpperCase().charAt(0);
        System.out.print("gender: " + (gender == 'M'));

        if (gender == 'M') {
            System.out.println("남성");
        } else if (gender == 'F') {
            System.out.println("여성");
        }

        /*
        if (gender.equalsIgnoreCase("M")) {
            System.out.println("남성");
        } else if (gender.equalsIgnoreCase("F")) {
            System.out.println("여성");
        }
        */
    }
}
