package fundamentals.springcore.loosecoupling;

public class LooseCoupling {
    public static void main(String[] args) {
        Helper help=new Database();
        Manager manage=new Manager(help);
        System.out.println(help.GetDetails());
    }
}
