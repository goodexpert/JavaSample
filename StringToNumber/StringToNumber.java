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

    // case 1, str = null
    // case 2, str = "    "
    // case 3, str = " 12 3 "
    // case 4, str = "12x34"
    public static Integer parseInt(String str) throws Exception {
        if (str == null)
            throw new NullPointerException();

        str.trim();
        if (str.isEmpty())
            throw new NumberFormatException("Invalid number format");

        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
//                return null;
                throw new NumberFormatException("Invalid number format");
            } else {
                number = number * 10 + (ch - '0');
            }
        }
        return number;
    }
}
