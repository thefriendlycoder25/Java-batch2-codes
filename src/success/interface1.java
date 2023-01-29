package success;
interface calculation{
    float pi = 3.14f;
    void area();
    void perimeter();
    private void sherlock(){
        System.out.println("I am sherlock");
    }
   default void greet(){
        sherlock();
       System.out.println("Welcome to the program");
   }
}
class square implements calculation{
    int side;

    public void greet(){
        System.out.println("This is overridden greet()");
    }
   public void area(){

        System.out.println("The area of square is "+ side*side);
    }
   public void perimeter(){
        System.out.println("The perimeter of sqaure is "+4*side);
    }
}
class rectangle implements calculation{
    int length , breadth;
   public void area(){
        System.out.println("The area of rectnagle is "+ length*breadth);
    }
   public void perimeter(){
        System.out.println("The perimeter of rectangle is "+2*(length+breadth));
    }
}
class circle implements calculation{
    int radius;
   public void area(){
        System.out.println("The area of circle is "+ pi*radius*radius );
    }
   public void perimeter(){
        System.out.println("The circumference of circle is "+ 2*pi*radius);
    }
}
public class interface1 {
    public static void main(String[] args) {
        square obj1 = new square();
        obj1.side = 7;
        obj1.area();
        obj1.perimeter();
//        obj1.sherlock();
        obj1.greet();

        circle obj2 = new circle();
        obj2.radius = 40;
        obj2.area();
        obj2.perimeter();

        rectangle obj3 = new rectangle();
        obj3.length = 8;
        obj3.breadth = 7;
        obj3.area();
        obj3.perimeter();
    }
}
