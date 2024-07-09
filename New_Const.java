public class New_Const {
    int age;
    String name;

    New_Const(String Name, int Age) {
        age = Age;
        name = Name;
    }

    public static void main(String[] args) {
        New_Const obj = new New_Const("Smriti", 34);
        System.out.println(obj.name);
        System.out.println(obj.age);

    }

}
