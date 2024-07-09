public class Const {
    String name;
    int age;

    public Const(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public static void main(String[] args) {
        Const con = new Const(17, "Ethnus");
        Const con1 = new Const(20, "Codemithra");
        System.out.println(con.age);
        System.out.println(con.name);
        System.out.println(con1.age);
        System.out.println(con1.name);

    }

}
