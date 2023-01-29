package success;

import java.util.Scanner;

class abc1{
    void xyz(){
        String str = "I am Iron Man";
        System.out.println(str.concat(" 3000"));
        System.out.println(str);

        str = "Thor Odinson";
        System.out.println(str);
    }
}
public class stringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str1 = new StringBuffer(sc.nextLine());
        System.out.println(str1);




//       StringBuffer str = new StringBuffer("I am Iron Man");
//        str.append(" 3000");//permanent changes to orignal string
//        System.out.println(str);
//        str.insert(2,"Thor");
//        System.out.println(str);
//        str.replace(2,11,"Encrypted");
//        System.out.println(str);
//        str.delete(2,11);
//        System.out.println(str);
//        str.reverse();
//        System.out.println(str);
//
    }
}
