public class MyProg {

    static int x = 10;

    public static void main(String[] args) {
        MyProg obj = new MyProg();
        MyProg obj1 = new MyProg();
        obj1.x = x + 1;
        System.out.println(obj.x);
        System.out.println(obj1.x);

    }
}
