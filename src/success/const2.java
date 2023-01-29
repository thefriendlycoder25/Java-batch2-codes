package success;
class external{
    external()
    {
        System.out.println("Constructor with no params");
    }
    external(int a)
    {
        System.out.println("Constructor with 1 params "+a);
    }
    external(int a, int b)
    {
        System.out.println("Constructor with 2 params "+a+" "+b);
    }

}
public class const2 {
    public static void main(String[] args) {
        external obj1 = new external(5,10);
    }
}
