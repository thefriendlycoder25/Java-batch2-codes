package success;
public class meth {
    static void area(float radius){// circle
        System.out.println("the Area of circle is "+3.14*radius*radius);
    }
    static void area(int side){ // sqaure
        System.out.println("The area of sqaure is "+side*side);
    }
    static void area(int length, int breadth){ // rectangle
        System.out.println("The area of rectangle is "+length*breadth);
    }
    static void area(float base, float height){// triangle
        System.out.println("the area of triangle "+0.5*base*height);
    }
    public static void main(String[] args) {
       area(5.0f,10.0f);
    }
}
