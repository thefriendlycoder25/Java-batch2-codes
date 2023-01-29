package success;

public class fianly {
   static int convert(String str){
        try{
            int a = Integer.parseInt(str);
            return a;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this after catch block");
        }

        return 0;
    }
    public static void main(String[] args) {
        String str = "1234";
        System.out.println("The integer value is "+ convert(str));
    }
}
