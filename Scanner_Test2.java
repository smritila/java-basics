import java.util.*;

public class Scanner_Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("......Welcome to Ethnus ATM.....");
        System.out.println("Enter the amount to withdraw");
        int amount = in.nextInt();
        System.out.print("Enter the PIN:");
        // int pin = in.nextInt();
        System.out.println("Thanks for using Ethnus ATM");
        System.out.println("Amount you have withdrawn is:" + amount);
        in.close();

    }

}
