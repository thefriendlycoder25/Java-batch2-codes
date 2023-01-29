package success;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class ageTeller {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
//        today's date

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DOB in dd/mm/yyyy");
        String dob1 = sc.next();

        String[] arr;

//        breaking the date in day , month and year
        arr = dob1.split("/");
//        Split function returns an array

        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);

//        creating date object of user's DOB
        LocalDate dob2 = LocalDate.of(y,m,d);

//      Calculating the date difference
        int days = Period.between(dob2, today).getDays();
        int months = Period.between(dob2, today).getMonths();
        int years = Period.between(dob2, today).getYears();

        System.out.println("You are "+days+" days, "+months+" months "+years+" years old!");

    }
}
