package fundamentals.springcore.autowiring;


public class Manager {
    Helper help;
    Manager(Helper help){
        this.help=help;
    }
    public String getDetails(){
        return help.getDetails();
    }
}
