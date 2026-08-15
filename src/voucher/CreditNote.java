package voucher;

import exportformat.ExportFormat;
import sendingchannel.SendingChannel;
import signatureprovider.SignatureProvider;

public class CreditNote extends Voucher{
    public CreditNote(ExportFormat exporter, SendingChannel channel, SignatureProvider signature) {
        super(exporter, channel, signature);
    }

    @Override
    public String buildContent() {
        return "Credit Note #1 - Total Cost:10000";
    }
}
