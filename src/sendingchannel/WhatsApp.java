package sendingchannel;

public class WhatsApp implements SendingChannel {
    @Override
    public void send(String content) {
        System.out.println("Sending WhatsApp message...");
    }
}
