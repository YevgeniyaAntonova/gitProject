package AddTasks.AddTasks.Ex7;

public class StringArrays {
    String [] word1;
    String [] word2;
    public StringArrays(String [] word1, String [] word2){
        this.word1 = word1;
        this.word2 = word2;
    }
    public boolean isEquivalent(){
        String w1 = word1[0];
        String w2 = word2[0];
        for(int i = 1; i < word1.length; i++){
            w1 = w1.concat(word1[i]);
        }
        for (int j = 1; j < word2.length; j++){
             w2 = w2.concat(word2[j]);
        }
        System.out.println(w1);
        System.out.println(w2);
        return w1.equals(w2);
    }
}
