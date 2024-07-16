// public class Loop {
//     public static void main(String[] args) {
//         int i;
//         for (i = 0; i < 3; i++) {
//             System.out.println(i);
//         }
//         System.out.println(i);
//     }

// }

// public class Loop {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class Loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
