package fundamentals.springcore.autowiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCoupling {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("context.xml");
        Manager manage= (Manager) context.getBean("manage");
        System.out.println(manage.getDetails());

    }
}
