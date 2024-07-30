
// class A {
//     public void show() {
//         System.out.println("in A show");

//     }
// }

// class B extends A{
// public void show(){

// System.out.println("in B Show");
// }
// }
// public class Anonymous_Inner {
//     public static void main(String[] args) {
//         // A obj = new B();
//         A obj = new A()

//         {
//             public void show() {
//                 System.out.println("in new Show");
//             }
//         };
//         obj.show();

//     }

// }

abstract class A {

    public abstract void show();

    public abstract void config();

}

public class Abstract_and_anonymous_inner {
    public static void main(String[] args) {

        // A obj = new B
        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in new config");
            }

        };
        obj.show();

    }

}