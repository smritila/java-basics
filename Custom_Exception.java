class EthnusException extends Exception {
    public EthnusException(String string) {
        super(string);
    }

}

public class Custom_Exception {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0)
                throw new EthnusException("I don't want to do print zero");

        } catch (EthnusException e) {
            j = 18 / i;
            System.out.println("that is default output" + e);

        } catch (Exception e) {
            System.out.println("Something went wrong" + e);

        }
        System.out.println(j);
        System.out.println("Bye");

    }

}
