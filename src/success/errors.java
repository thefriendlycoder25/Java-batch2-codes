package success;
import java.util.Scanner;
public class errors {
    static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        try {
            System.out.println("The division is " + divide(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("This is after try block");
    }
}
