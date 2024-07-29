abstract class Animal {
    public abstract void makeSound();// implementation is not possible here in abstract method.

    public void sleep() {
        System.out.println("Zzz");
    }

}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }

}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("In eating..");
    }

}

public class Abstract_Demo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.sleep();
        myCat.eat();

    }
}
