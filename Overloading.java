public class Overloading {
    int age;
    float marks;
    String name;
    String gender;

    Overloading(String Name, int Age) {
        this.name = Name;
        this.age = Age;
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);

    }

    Overloading(String Name, int Age, String Gender) {

        this.name = Name;
        this.age = Age;
        this.gender = Gender;
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
        System.out.println("Gender:" + Gender);

    }

    Overloading(int Age, float Marks, String Name) {
        this.age = Age;
        this.marks = Marks;
        this.name = Name;
        System.out.println("Age: " + Age);
        System.out.println("Marks: " + Marks);
        System.out.println("Name: " + Name);

    }

    public static void main(String[] args) {

        Overloading obj1 = new Overloading("Smriti", 34);
        Overloading obj2 = new Overloading("Smriti", 34, "Female");
        Overloading obj3 = new Overloading(24, 99.9f, "Smriti");

    }

}