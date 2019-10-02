import java.util.Scanner;

class Sample {
    // Entry point
    public static void main(String[] args) {
        try {
            Scanner sc = null;
            // sc is a null object.
            sc.next();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        int korean, english, math;

        System.out.print("Korean: ");
        korean = scanner.nextInt();

        System.out.print("English: ");
        english = scanner.nextInt();

        System.out.print("Math : ");
        math = scanner.nextInt();

        int total = korean + english + math;
        System.out.println("Total   : " + total);
        System.out.println("Average : " + total / 3.0);

        int avg = (int)(total / 3.0 * 100 + 0.5);
        System.out.println("Average2 : " + avg / 100.0);
        System.out.format("Average3 : %.2f\n", total / 3.0);
    }
}
