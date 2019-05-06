import java.util.Random;

public class MyClass {
    public void printMsg(String str) {
        System.out.println(str);
    }
    public boolean guessMyNumber(int n){
// TODO: your code here
        Random rn = new Random();

        if (rn.nextInt(10 - 0 + 1) == n) {
            return true;
        } else {
            return false;
        }
    }
    public void acceptAndReverse(int[] array){
// TODO: your code here
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    public void acceptAndReversMe(int[] array){
// TODO: your code here

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    public void repeatString(String str, int count) {
// TODO: your code here
        String name = "";
        int i = 0;
        while (i < count) {
            name += str;
            i++;
        }
        System.out.print(name);
    }
}
