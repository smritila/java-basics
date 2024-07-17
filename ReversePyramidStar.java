public class ReversePyramidStar {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            // print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}
