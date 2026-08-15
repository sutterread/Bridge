package voucher;

import exportformat.ExportFormat;
import sendingchannel.SendingChannel;
import signatureprovider.SignatureProvider;

public class WithholdingCertificate extends Voucher {
    public WithholdingCertificate(ExportFormat exporter, SendingChannel channel, SignatureProvider signature) {
        super(exporter, channel, signature);
    }

    @Override
    public String buildContent() {
        return "Withholding Certificate #1 - Total Cost:10000";
    }
}
