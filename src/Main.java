import exportformat.EDIExporter;
import exportformat.JSONExporter;
import exportformat.PDFExporter;
import exportformat.XMLExporter;
import sendingchannel.Email;
import sendingchannel.WebPortal;
import sendingchannel.WhatsApp;
import signatureprovider.CloudSignature;
import signatureprovider.HSMSignature;
import signatureprovider.LocalSignature;
import voucher.*;

public class Main {
    public static void main(String[] args) {
        Voucher voucher1 = new SalesInvoice(new PDFExporter(),new WhatsApp(), new CloudSignature());
        voucher1.process();
        System.out.println("\n");

        Voucher voucher2 = new WithholdingCertificate(new XMLExporter(), new WebPortal(), new LocalSignature());
        voucher2.process();
        System.out.println("\n");

        Voucher voucher3 = new CreditNote(new JSONExporter(), new Email(), new HSMSignature());
        voucher3.process();
        System.out.println("\n");

        Voucher voucher4 = new DebitNote(new PDFExporter(), new Email(), new LocalSignature());
        voucher4.process();
        System.out.println("\n");

        Voucher voucher5 = new WithholdingCertificate(new JSONExporter(), new WhatsApp(), new HSMSignature());
        voucher5.process();
        System.out.println("\n");

        Voucher  voucher6 = new CreditNote(new EDIExporter(), new WebPortal(), new LocalSignature());
        voucher6.process();
    }
}
