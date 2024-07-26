class Initializer {
    int speed;

    // Constructor
    Initializer() {
        System.out.println("Constructor is invoked");
    }

    // Instance initializer block
    {
        System.out.println("Instance initializer block is invoked");
    }

    public static void main(String[] args) {
        Initializer b1 = new Initializer(); // Creates the first instance
        // Initializer b2 = new Initializer(); // Creates the second instance
    }
}
