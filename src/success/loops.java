package success;
import java.util.Scanner;
class ext {
    int n ;
    void table(){
        for(int i = 1; i<=10; i++)
        {
            System.out.println(n*i);
        }
    }
    void table1()
    {
        int i = 1;
        while(i<=10)
        {
            System.out.println(n*i);
            i++;
        }
    }
}
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ext obj1 = new ext();
        System.out.println("Enter a number");
        obj1.n = sc.nextInt();
        obj1.table1();
    }
}
