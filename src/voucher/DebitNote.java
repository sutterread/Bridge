package voucher;

import exportformat.ExportFormat;
import sendingchannel.SendingChannel;
import signatureprovider.SignatureProvider;

public class DebitNote extends Voucher {
    public DebitNote(ExportFormat exporter, SendingChannel channel, SignatureProvider signature) {
        super(exporter, channel, signature);
    }

    @Override
    public String buildContent() {
        return "Debit Note #1 - Total Cost:10000";
    }
}
