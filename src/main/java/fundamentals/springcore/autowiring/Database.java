package fundamentals.springcore.autowiring;


public class Database implements Helper {
    @Override
    public String getDetails(){
        return "something from here";
    }
}
