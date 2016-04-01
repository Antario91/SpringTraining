package SpringTraining;

import Interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringMain
{
    public static void main( String[] args ){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Performers.xml");
        Performer performer = (Performer) ctx.getBean("dufron");
        performer.perform();

        performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
