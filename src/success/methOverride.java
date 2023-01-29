package success;
class dad{
    void shoes1(){
        System.out.println("Dad's shoes");
    }
    void shirtBlue(){
        System.out.println("Dad's Blue shirt of XL size");
    }
}
class beta extends dad{
    @Override
    void shirtBlue(){
        System.out.println("Overriden method i.e. altered the shirt");
    }
}
public class methOverride {
    public static void main(String[] args) {
        beta obj1 = new beta();
        obj1.shirtBlue(); // calls the overridden method in derived class
    }
}
