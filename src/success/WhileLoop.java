package success;
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        int rnum; //stores the random number
        int unum; // stores the user given number
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        rnum = r.nextInt(10);
        System.out.println("Guess the number");
        unum = sc.nextInt();
        while (rnum!=unum) {
            if(rnum>unum){
                System.out.println("Peeche reh gaye");
            }
            else if (rnum<unum){
                System.out.println("Aage chale gaye!");
            }
            System.out.println("Guess the number");
            unum = sc.nextInt();
        }
        System.out.println("Congratulations you guessed it right");
        System.out.println("The random number is "+rnum);
        System.out.println("Your guessed number is "+unum);
    }


}
