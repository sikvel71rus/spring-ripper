package quoters;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init(){
        System.out.println("Phase 2: "+repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1: "+repeat);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public void sayQuote() {

        for (int i = 0; i < repeat; i++) {
            System.out.println("message = "+ message);

        }
    }


}
