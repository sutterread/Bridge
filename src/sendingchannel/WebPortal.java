package sendingchannel;

public class WebPortal implements SendingChannel {
    @Override
    public void send(String content) {
        System.out.println("Voucher ready on web portal...");
    }
}
