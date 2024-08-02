class Z {

}

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Hello");

            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());
        // obj1.start();
        // try{
        // Thread.sleep(2);
        // }
        // catch(InterruptedException e){
        // e.printStackTrace();
        // }
        // }
        // obj2.start();

    }
}
