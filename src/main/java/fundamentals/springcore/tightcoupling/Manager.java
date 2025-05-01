package fundamentals.springcore.tightcoupling;

public class Manager {
    Database data=new Database();
    public String GetDetails(){
        return data.GetDetails();
    }
}
