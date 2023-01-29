package success;


class shuttle implements Runnable{
    @Override
    public void run() {
       int i = 0;
       while(i<400){
           System.out.println(i++);
       }
    }
}
class threadB implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<700){
            System.out.println("This is Thread B");
            i++;
        }
    }
}
class threadC implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<700){
            System.out.println("THREAD C IS THIS");
            i++;
        }
    }
}


public class thread2 {
    public static void main(String[] args) {
        shuttle s1 = new shuttle();
        Thread racket = new Thread(s1,"Chintu");
        racket.setPriority(Thread.MIN_PRIORITY);
        threadB b = new threadB();
        Thread t2 = new Thread(b,"Pintu");
        t2.setPriority(Thread.MIN_PRIORITY);
        threadC c = new threadC();
        Thread t3 = new Thread(c,"Sonu");
        t3.setPriority(Thread.MAX_PRIORITY);

        racket.start();
        t2.start();
        t3.start();





//        System.out.println(racket.toString());
//        System.out.println(t2.toString());
//        System.out.println(t3.toString());
    }
}

