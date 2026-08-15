package signatureprovider;

public class HSMSignature implements SignatureProvider {
    @Override
    public void sign(String content) {
        System.out.println("Device ready for HSM signature...");
    }
}
