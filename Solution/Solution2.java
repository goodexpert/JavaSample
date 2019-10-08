public class Solution2 {
    public static main(String[] args) {
        for (int num = 1; num <= 9; num++) {
            for (int i = 1; i <= 9; i++) {
                System.out.format("%d x %d = %d\n", num, i, (num * i));
            }
            System.out.println("============================");
        }
    }
}
