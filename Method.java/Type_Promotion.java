
public class Type_Promotion {
    public static void main(String[] args) {
        byte b1 = 2;
        byte b2 = 10;
        int result = b1 * b2;// lossy conversion
        System.out.println(result);

    }

}
