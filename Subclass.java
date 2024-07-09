// Copy the Value of one Object to Another
class Subclass {
    String name;
    int age;

    Subclass(String Name, int Age) {
        name = Name;
        age = Age;
        System.out.println(name);
        System.out.println(age);

    }

    Subclass(Subclass S) {
        String Name = S.name;
        int Age = S.age;
        System.out.println(Name);
        System.out.println(Age);

    }

}

class Cricketer {
    public static void main(String[] args) {
        Subclass S1 = new Subclass("Arun", 35);
        Subclass S2 = new Subclass(S1); // copy the value of one object to another
    }
}