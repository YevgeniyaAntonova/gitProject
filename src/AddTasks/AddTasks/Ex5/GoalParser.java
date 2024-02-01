package AddTasks.AddTasks.Ex5;

public class GoalParser {
    String command;
    public GoalParser(String command){
        this.command = command;
    }
    public String Interpret(){
        command = command.replace("(al)", "al");
        command = command.replace("()", "o");
        return command;
    }
}
