package success;
abstract class discounts{
    int minDiscount; // variable
    int addtionalDiscount;
    void greet(){ // normal method
        System.out.println("Select any below card for additional Discount");
    }
    abstract void additionalDiscount(); //unimplemented method
}
class hdfc extends discounts{
    void additionalDiscount(){
        super.addtionalDiscount = 1000;
        System.out.println("1000 rs extra discount credited!!");
    }
}
 class sbi extends discounts{
    void additionalDiscount(){ //implementation of the abstract method
        super.addtionalDiscount = 750;
        System.out.println("750 rs extra discount credited!!");
    }
}
public class abstractclasses {
    public static void main(String[] args) {
        hdfc h1 = new hdfc();
        h1.additionalDiscount();

        sbi s1 = new sbi();
        s1.additionalDiscount();
    }

}
