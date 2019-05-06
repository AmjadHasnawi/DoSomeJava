import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("My first java program!!");
        MyClass mycalss = new MyClass();
        mycalss.printMsg("Thank you for teaching me Java");

        Scanner reader = new Scanner(System.in);
//        for (int i = 0 ; i < 3; i++) {
//            System.out.println("Enter a number: ");
//            int n = reader.nextInt();
//            boolean result = mycalss.guessMyNumber(n);
//            if (result == true ) {
//                System.out.println("Congratulation!! You win!!");
//                break;
//            }
//            if (i == 2) {
//                System.out.println("Game Over!!");
//            }
//        }
//        int[] num = new int[5];
//        for ( int i = 0; i < 5; i++) {
//            System.out.println("Enter  Number:");
//            num[i] = reader.nextInt();
//        }
//        mycalss.acceptAndReverse(num);
//        mycalss.acceptAndReversMe(num);
        System.out.println("Enter Name:");
        String str = reader.next();
        System.out.println("Enter Counter");
        int count = reader.nextInt();
        mycalss.repeatString(str, count);


    }
}
