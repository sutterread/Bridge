package voucher;

import exportformat.ExportFormat;
import sendingchannel.SendingChannel;
import signatureprovider.SignatureProvider;

public class SalesInvoice extends Voucher{
    public SalesInvoice(ExportFormat exporter, SendingChannel channel, SignatureProvider signature) {
        super(exporter, channel, signature);
    }

    @Override
    public String buildContent() {
        return "Sale Invoice #1 - Total Cost:10000";
    }
}
