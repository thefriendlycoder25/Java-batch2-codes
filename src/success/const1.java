package success;
import java.util.Scanner;
class result{
    Scanner sc = new Scanner(System.in);
    int r , m;
    result()
    {
        System.out.println("Enter your Roll no");
       r = sc.nextInt();
        System.out.println("Enter your marks");
       m = sc.nextInt();
    }
    void display()
    {
        System.out.println("roll no : "+r+" Marks: "+m);
    }
}
public class const1 {
    public static void main(String[] args) {
      result stud1 = new result();
      result stud2 = new result();
      result stud3 = new result();
      stud1.display();
      stud2.display();
      stud3.display();
    }
}
