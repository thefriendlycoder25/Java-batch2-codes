package success;

import java.util.Scanner;

public class exceptionHandling {
    static float divide (float a, float b){
        return a/b;
    }
    public static void main(String[] args) {
        int b = 1;
        int [] arr = {65,87,54,23,15};
        String str = null;
//        System.out.println(str+str1);
        try {
            System.out.println(str.length());
        }
        catch(ArithmeticException ae){
            System.out.println("Buddhu Zero se divide kar diya!");
        }
        catch(IndexOutOfBoundsException ib){
            System.out.println("array ki sima paar kar rahe ho");
        }
        catch(Exception obj1){
            System.out.println(obj1);
            System.out.println("jagatpita executed");
        }

    }
}
