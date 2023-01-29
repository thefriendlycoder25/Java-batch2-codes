package success;

import java.util.Scanner;

public class throws1 {
    static float divide(float a , float b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        try {
            System.out.println("The division is " + divide(a, b));
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("You have divided by zero");
        }
    }
}
