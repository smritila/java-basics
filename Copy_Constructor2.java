class Copy_Constructor2 {
    int age;
    String name;

    public Copy_Constructor2(int Age, String Name) {
        this.age = Age;
        this.name = Name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Copy_Constructor2 obj1 = new Copy_Constructor2(25, "Johan");
        Copy_Constructor2 obj2 = (Copy_Constructor2) obj1.clone();

        System.out.println("Original Object" + obj1.age);
        System.out.println("Original Object" + obj2.age);

    }

}