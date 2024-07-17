public class RightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;// number of rows
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
