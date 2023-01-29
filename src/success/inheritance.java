package success;
class analogueWatch{
    void time(){
        System.out.println("Shows time");
    }
    void date(){
        System.out.println("Shows date");
    }
}
class digitalWatch extends analogueWatch{
    void alarm(){
        System.out.println("Rings alarm");
    }
    void stopwatch(){
        System.out.println("Runs the stopwatch from digital watch");
    }
}
class smartWatch extends digitalWatch{
    void stepTracker(){
        System.out.println("Tracks the steps");
    }
    void heartRate(){
        System.out.println("Measures the heart rate");
    }
}

public class inheritance {
    public static void main(String[] args) {
        smartWatch obj1 = new smartWatch();
        obj1.time();
        obj1.date();
        obj1.alarm();
        obj1.stopwatch();
    }
}
