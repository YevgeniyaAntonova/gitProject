package AddTasks.AddTasks.Ex4;

import java.util.ArrayList;
import java.util.Arrays;

public class Words {
    String words;
    String x;
    public Words(String words, String x){
        this.words = words;
        this.x = x;
    }

    public void findWordsContaining (){
        String[] word = words.split(",");
        ArrayList arr = new ArrayList<>();
        for (int i = 0; i < word.length; i++){
            if (word[i].contains(x)){
                arr.add(i);
            }
        }
        System.out.println(arr.toString());
    }
}
