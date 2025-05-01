package fundamentals.springcore.applicationcontext;


public class Database implements Helper {
    @Override
    public String getDetails(){
        return "something from here";
    }
}
