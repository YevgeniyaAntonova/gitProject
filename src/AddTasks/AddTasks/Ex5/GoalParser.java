package AddTasks.AddTasks.Ex5;

public class GoalParser {
    String command;
    public GoalParser(String command){
        this.command = command;
    }
    public String Interpret(){
        /*command.replace("(al)", "al");
        System.out.println(command);*/
        //command.replace("()", "o");
        command.replace("()", "[]");
        return command;
    }
}
