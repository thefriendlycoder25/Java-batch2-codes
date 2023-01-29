package success;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {
//        try{
//            f.createNewFile();
//        }catch(Exception e){
//            System.out.println(e);
//        }

//        try {
//            FileWriter fileWriter = new FileWriter("success.txt");
//            fileWriter.write("This is the first line of the file");
//            fileWriter.close();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

//    try{
//        Scanner sc = new Scanner(f);
//        if(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
//    }catch(Exception e){
//        System.out.println(e);
//    }
    File f = new File("success.txt");
        try {
            FileWriter fileWriter = new FileWriter("success.txt");
            fileWriter.write("This is the first line of the file");
            fileWriter.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            FileWriter fileWriter = new FileWriter("success.txt", true);
            fileWriter.write("\nThis is the second line");
            fileWriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
        f.delete();



    }

}
