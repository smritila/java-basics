
public class TryCatchExample2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        try {
            int index = 4;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: index " + e.getMessage() + " is out of bounds.");
        } finally {
            System.out.println("end of try-catch block");
        }

    }

}
