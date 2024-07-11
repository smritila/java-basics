
import java.util.Scanner;

public class DefaultDelimiterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("This is a test string");
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println("Token:" + token);

        }
        scanner.close();

    }

}
