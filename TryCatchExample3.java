public class TryCatchExample3 {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
            System.out.println("Length of the string:" + length);
        } catch (NullPointerException e) {
            System.out.println("An error occured : Attempted to access a method of a null object reference");
        } finally {
            System.out.println("End of try-catch block");
        }

    }

}
