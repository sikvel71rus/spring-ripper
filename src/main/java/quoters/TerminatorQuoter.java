package quoters;

public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

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
