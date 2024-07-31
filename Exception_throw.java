public class Exception_throw {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        try {
            // j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("I don't want to do print zero");
        } catch (ArithmeticException e) {
            j = 18 / i;
            if (i == 0)
                System.out.println("that is default output" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong." + e);
        }
        System.out.println(j);
        System.err.println("Bye");

    }

}
