package success;
import java.util.Scanner;
class negDim extends Exception{
    @Override
    public String toString() {
        return "Negative dimension Exception occured!!!";
    }
    @Override
    public String getMessage() {
        return "Please enter a postive side";
    }
}
public class exceptionProgram {
    static Scanner sc = new Scanner(System.in);
    static int perimeter(int side){
        while (side<0){
            try{
                throw new negDim();
            }catch(negDim nd){
                System.out.println(nd.toString());// similar to sout(nd)
                System.out.println(nd.getMessage());
                side = sc.nextInt();
            }
        }
        return 4*side;
    }
    public static void main(String[] args) {

       int s ;
        System.out.println("Enter the side of Square");
        s = sc.nextInt();
        System.out.println("The perimeter of square is "+perimeter(s));
    }
}
