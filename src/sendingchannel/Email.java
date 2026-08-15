package sendingchannel;

public class Email implements SendingChannel {
    @Override
    public void send(String content) {
        System.out.println("Sending email...");
    }
}
