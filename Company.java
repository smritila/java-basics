// class Company{
//     String name;

//      public static void main(String[] args){
//         Company c1 = new Company();
//         c1.name = "Ethnus";
//         c1= new Company();
//         System.out.println(c1.name);

//      }
// }

class Company {
    String name;

    public static void main(String[] args) {
        Company c1 = new Company();
        Company c2 = new Company();
        c2.name = "Codemithra";
        // c1.name= "Ethnus";
        // Company c2 = c1;
        c1 = null;
        // c2=c1;
        System.out.println(c2.name);
        System.out.println(c1);

    }
}
