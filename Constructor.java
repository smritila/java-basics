public class Constructor {
    String name;
    int age;

    public Constructor() {
        System.out.println("Hello");

    }

    public Constructor(int age, String name) {
        this();
        this.age = age;
        this.name = name;
        System.out.println(age);
        System.out.println(name);

    }

    public static void main(String[] args) {
        Constructor con = new Constructor(17, "ethnus");
        Constructor con1 = new Constructor(18, "codemithra");

    }

}
