package success;

class chintu extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<400){
            System.out.println("Chintu Thread");
            i++;
        }
    }
}
class pintu extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<400){
            System.out.println("PINTU THREAD");
            i++;
        }
    }
}

class mythread1 extends Thread{
    @Override
    public void run() {
        int i = 0 ;
        while (i<400){
            System.out.println("this is Thread1");
            i++;
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run() {
        int i = 0 ;
        while (i<400){
            System.out.println("THREAD 2 IS THIS");
            i++;
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        chintu c1 = new chintu();
        pintu p1 = new pintu();
//        mythread1 t1 = new mythread1("String");
        mythread2 t2 = new mythread2();
        c1.start();
        p1.start();
//        t1.start();
        t2.start();
    }
}

class threadname extends Thread{//creating thread
    @Override
    public void run() {
        //code for thread to excecute
    }
}


