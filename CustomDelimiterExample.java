
import java.util.Scanner;

public class CustomDelimiterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("apple,banana,cherry");
        scanner.useDelimiter(",");
        // Scanner scanner = new Scanner("This is a test string");
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println("Token:" + token);

        }
        scanner.close();

    }

}
