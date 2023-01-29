package success;
class dad1 {
    String name;
}
class child1 extends dad1 {
    String name;
    void setDadName(String name){
        super.name = name;
    }
    void getDadName(){
        System.out.println(super.name);
    }
}
public class thisAndSuper {
    public static void main(String[] args) {
       child1 c1 = new child1();
        c1.setDadName("Ram");
        c1.getDadName();
    }
}

