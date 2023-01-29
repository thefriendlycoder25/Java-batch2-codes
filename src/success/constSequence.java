package success;
class base{
    base(){ //executes when no super(); is used
        System.out.println("Default constructor");
    }
    base(int a , int b){
        System.out.println("Base class constructor");
    }

}
class derived extends base{
    derived (int a , int b){
        super(a,b); // to pass the parameters to the superclass constructors
        System.out.println("Derived class constructor");
    }

}
public class constSequence {
    public static void main(String[] args) {
        derived obj1 = new derived(5,7);
    }
}
