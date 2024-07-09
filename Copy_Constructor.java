public class Copy_Constructor {
    int age;
    String name;

    // Regular constructor
    Copy_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Copy_Constructor(Copy_Constructor original) {
        this.name = original.name;
        this.age = original.age;
    }

    void display() {

        System.out.println("Name : " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Copy_Constructor obj1 = new Copy_Constructor("John", 25);
        Copy_Constructor obj2 = new Copy_Constructor(obj1);
        // using copy constructor
        obj2.display();

    }

}