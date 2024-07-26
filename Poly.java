class Subclass {
    int num = 90;// Data members not be overridden. metod os overridden, so runtme polymorphism
                 // cannt be achieved by data members.

}

class Poly extends Subclass {
    int num = 150;

    public static void main(String args[]) {
        Subclass obj = new Poly();
        System.out.println(obj.num);
        System.out.println(((Poly) obj).num);

    }

}
