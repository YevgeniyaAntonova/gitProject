package AddTasks.AddTasks.Ex6;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentences {
    String sentences;
    public Sentences(String sentences){
        this.sentences = sentences;
    }


    public int mostWordsFound(){
        String [] arraySentences = sentences.split(",");
        int[] n = new int[arraySentences.length];
        int max = 0;
        for (int i = 0, k = 0; i < arraySentences.length; i++ ) {
            String [] arrWords = arraySentences[i].split(" ");
            n[i] = arrWords.length;
        }
        Arrays.sort(n);
        return max = n[n.length-1];
    }
}
