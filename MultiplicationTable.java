import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.print("Enter a positive integer");
        } else {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + (number * i));
            }

        }
        sc.close();
    }

}
