package fundamentals.springcore.tightcoupling;

public class TightCoupling {
    public static void main(String[] args) {
        Manager manage=new Manager();
        System.out.println(manage.GetDetails());
    }
}
