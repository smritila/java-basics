class A {
    public void show() {
        System.out.println("In a show");
    }

    public void config() {
        System.out.println("in A config");

    }

}

class B extends A {
    public void show1() {/// just write show in place of show1()
        System.out.println("in B show");
    }

}

public class Method_Overriding {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();
        obj.config();

    }

}