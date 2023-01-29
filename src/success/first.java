package success;

import java.util.Scanner;


public class first { // Main class
    public static void main(String[] args) {
        int[] marks = new int[5];// declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
