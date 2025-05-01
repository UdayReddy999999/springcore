package fundamentals.springcore.loosecoupling;


public class Manager {
    Helper help;
    Manager(Helper help){
        this.help=help;
    }
    public String GetDetails(){
        return help.GetDetails();
    }
}
