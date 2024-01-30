package AddTasks.Ex1;

public class IPAddress {
    String ipAddress;
    public IPAddress(String ipAddress){
        this.ipAddress = ipAddress;
    }
    public String DefahgadIP(){
        return ipAddress.replace(".", "[.]");
    }

}
