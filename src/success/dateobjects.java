package success;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateobjects {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        LocalTime time =LocalTime.now();



        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = df.format(dt);


//        System.out.println(dt);
//        System.out.println(date);

        System.out.println(dt.getMonth());




    }
}
