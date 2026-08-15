package voucher;

import exportformat.ExportFormat;
import sendingchannel.SendingChannel;
import signatureprovider.SignatureProvider;

public abstract class Voucher {

    protected ExportFormat exporter;
    protected SendingChannel channel;
    protected SignatureProvider signature;

    public Voucher(ExportFormat exporter, SendingChannel channel, SignatureProvider signature) {
        this.exporter = exporter;
        this.channel = channel;
        this.signature = signature;
    }

    public abstract String buildContent();

    public void process(){
        exporter.export(buildContent());
        channel.send(buildContent());
        signature.sign(buildContent());
    }


}
