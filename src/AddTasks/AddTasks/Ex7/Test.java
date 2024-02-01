package AddTasks.AddTasks.Ex7;

public class Test {
    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String [] word2 = new String[]{"a", "bc"};
        StringArrays str = new StringArrays(word1, word2);
        System.out.println(str.isEquivalent());
    }
}
