package success;
interface shyamu{
    void meth1();
    void meth2();
}

interface damu{
    default void meth1(){
        System.out.println("Default meth1 in damu");
    }
    void meth3();
    void meth4();
}
class abc implements damu{
   public void meth3(){
        System.out.println("");
    }
   public void meth4(){
       System.out.println("");
   }
   public void meth2(){
       System.out.println("");
   }
//   public void meth1(){
//       System.out.println("Meth1 in class abc");
//   }
}
public class Main {
    public static void main(String[] args) {
	damu obj1 = new abc();
	obj1.meth1();
    }
}
