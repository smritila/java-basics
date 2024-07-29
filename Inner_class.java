class A {
    int age;

    public void show() {
        System.out.println("in A show");

    }

    class B {
        public void config() {
            System.out.println("in B config");
        }

    }

}

public class Inner_class {
    public static void main(String[] args) {
        A obj = new A();
        obj.age = 20;
        obj.show();
        // B obj1 = new B();
        // obj1.config();
        A.B obj1 = obj.new B();
        obj1.config();

    }

}
