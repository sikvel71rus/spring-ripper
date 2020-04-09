import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.Quoter;
import quoters.TerminatorQuoter;

public class ApplicationMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean(TerminatorQuoter.class).sayQuote();
    }
}
