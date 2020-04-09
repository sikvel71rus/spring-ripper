import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.Quoter;
import quoters.TerminatorQuoter;

public class ApplicationMain {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        while (true){
            Thread.sleep(1000);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
