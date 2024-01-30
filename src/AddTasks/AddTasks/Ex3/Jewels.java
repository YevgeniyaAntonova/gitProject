package AddTasks.Ex3;

public class Jewels {
    String jewels;
    String stones;
    public Jewels(String jewels, String stones){
        this.jewels = jewels;
        this.stones = stones;
    }
    public void jewelsCount(){
        int count = 0;
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        for (int i = 0; i < jewels.length(); i++){
            for(int k = 0; k < stones.length(); k++){
                if (j[i] == s[k]){
                    count++;
                }
            }
        }
        System.out.printf("count = %d", count);
    }
}
