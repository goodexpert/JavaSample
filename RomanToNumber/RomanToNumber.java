import java.util.Scanner;

class RomanToNumber {
    // Entry point
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input roman number: ");
        String roman = scanner.next();

        if (roman.equalsIgnoreCase("I")) {
            System.out.println("number 1");
        } else if (roman.equalsIgnoreCase("II")) {
            System.out.println("number 2");
        } else if (roman.equalsIgnoreCase("III")) {
            System.out.println("number 3");
        } else if (roman.equalsIgnoreCase("IV")) {
            System.out.println("number 4");
        } else if (roman.equalsIgnoreCase("V")) {
            System.out.println("number 5");
        } else if (roman.equalsIgnoreCase("VI")) {
            System.out.println("number 6");
        } else if (roman.equalsIgnoreCase("VII")) {
            System.out.println("number 7");
        } else if (roman.equalsIgnoreCase("VIII")) {
            System.out.println("number 8");
        } else if (roman.equalsIgnoreCase("IX")) {
            System.out.println("number 9");
        } else if (roman.equalsIgnoreCase("X")) {
            System.out.println("number 10");
        } else {
            System.out.println("Invalid roman number");
        }
        /*
        System.out.println("Roman number : " + roman);
        System.out.println("toLowerCase : " + roman.toLowerCase());
        System.out.println("toUpperCase : " + roman.toUpperCase());
        System.out.println("\"I\" == \"I\": " + ("I" == "I"));
        System.out.println("compareTo(\"I\"): " + roman.compareTo("I"));
        System.out.println("equals(\"I\"): " + roman.equals("I"));
        System.out.println("equalsIgnoreCase(\"I\"): " + roman.equalsIgnoreCase("I"));
        */

        /*
        if (roman == "I") {
            System.out.println("number 1");
        } else if (roman == "II") {
            System.out.println("number 2");
        } else if (roman == "III") {
            System.out.println("number 3");
        } else if (roman == "IV") {
            System.out.println("number 4");
        } else if (roman == "V") {
            System.out.println("number 5");
        } else if (roman == "VI") {
            System.out.println("number 6");
        } else if (roman == "VII") {
            System.out.println("number 7");
        } else if (roman == "VIII") {
            System.out.println("number 8");
        } else if (roman == "IX") {
            System.out.println("number 9");
        } else if (roman == "X") {
            System.out.println("number 10");
        } else {
            System.out.println("Invalid roman");
        }
        */
    }
}
