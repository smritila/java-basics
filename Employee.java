// class Employee{
//     String name;
//     public static void main(String[]args){
//         Employee e1 = new Employee();
//         Employee e2 = new Employee();
//         e1.name="Keshav";
//         System.out.println(e1.name);

//     }

// }

class Employee {
    int id;
    String name;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Minka";
        e2.name = "Kabir";
        // System.out.println(e1.name);
        e1.id = 5;
        e2.id = 10;
        System.out.println(e1.name);
        System.out.println(e2.name);
        System.out.println(e1.id);
        System.out.println(e2.id);
    }

}
