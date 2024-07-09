class Copy_Constructor {
    int age;
    String name;

    public Copy_Constructor(int Age, String Name) {
        this.age = Age;
        this.name = Name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Copy_Constructor obj1 = new Copy_Constructor(25, "Johan");
        Copy_Constructor obj2 = (Copy_Constructor) obj1.clone();

        System.out.println("Original Object" + obj1.age);
        System.out.println("Original Object" + obj2.age);

    }

}