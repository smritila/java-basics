class A extends Thread {
    public void run()
    // public void show()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
        }

    }

}

class B extends Thread {
    public void run()
    // public void show()
    {
        for (int i = 1; i <= 10; i++)
            System.out.println("hello");
    }

}

public class MultipleThreads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        // obj1.show()
        // obj2.show()
        obj1.start();
        obj2.start();

    }

}
