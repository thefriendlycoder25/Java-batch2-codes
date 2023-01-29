package success;

import java.util.ArrayList;

public class wordle_logic {
    static int wordSize;
   static ArrayList<String> word = new ArrayList<>();
    wordle_logic(){
        word.add("w");
        word.add("a");
        word.add("t");


        wordSize = word.size();
    }
   static boolean checkExactLetter(int i){
        if(wordle_logic.word.get(i).equals(wordle.tf.get(i).getText())){
            return true;
        }
        return false;
    }

   static boolean checkLetter(int i){
        if(wordle_logic.word.contains(wordle.tf.get(i).getText())){
            return true;
        }
        return false;

    }
}
