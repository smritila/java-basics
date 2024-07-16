// public class ConditionalBlock {
// public static void main(String[] args) {
// int a = 10;
// if (a < 10 && a > 5) {
// System.out.println("if block is executed");

// } else {
// System.out.println("Not in range");
// }
// System.out.println("I am not in conditional block");
// }

// }

// public class ConditionalBlock {

//     public static void main(String[] args) {
//         String a = "codeithra";
//         if (a.equals("codemithra")) {
//             System.out.println("if block executed");
//         } else {
//             System.out.println("else block executed");
//         }

//     }

// }

// class ConditionalBlock {
//     public static void main(String[] args) {
//         int a = 10;
//         if (a < 12) {
//             if (a > 5) {
//                 System.out.println("Inner if block executed");
//             } else {
//                 System.out.println("Inner else block executed");
//             }

//         } else {
//             System.out.println("Outer else block executed");
//         }

//     }

// }

class ConditionalBlock {
    public static void main(String[] args) {
        int a = 10;
        if (a != 10) {
            System.out.println("If block executed");
        } else if (a == 12) {
            System.out.println("First else id block executed");
        } else if (a == 10) {
            System.out.println("Second else if block executed");
        } else {
            System.out.println("else block executed");

        }

    }

}
