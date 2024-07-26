// class Parent {
//     void method() {
//         System.out.println("Method from Parent");
//     }

// }

// class Child extends Parent {
//     void method() {
//         System.out.println("Method from child");
//     }

// }

// public class Upcasting {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         p.method();
//     }

// }

//downcasting

class Parent {
    void method() {
        System.out.println("Method from Parent");
    }
}

class Child extends Parent {
    void method() {
        System.out.println("Method from Child");
    }

    void childSpecificMethod() {
        System.out.println("Child-specific method");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        // Upcasting
        Parent p = new Child();
        p.method();

        // Downcasting
        if (p instanceof Child) {
            Child c = (Child) p;
            c.method();
            c.childSpecificMethod();
        }
    }
}
