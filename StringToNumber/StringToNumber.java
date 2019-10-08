import java.util.Scanner;

public class StringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp;

        do {
            System.out.print("Input number : ");
            temp = scanner.next();
            if (temp.equalsIgnoreCase("q"))
                break;
            else if (!isDigit(temp))
                continue;
            System.out.format("Input is %d\n", parseInt(temp));
        } while (true);
    }

    public static boolean isDigit(String str) {
        if (str == null)
            return false;

        boolean isDigit = true;

        str.trim();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                isDigit = false;
                break;
            }
        }
        return isDigit;
    }

    public static Integer parseInt(String str) {
        if (str == null)
            return null;

        int number = 0;
        str.trim();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                return null;
            } else {
                number = number * 10 + (ch - '0');
            }
        }
        return number;
    }
}
