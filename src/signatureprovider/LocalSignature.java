package signatureprovider;

public class LocalSignature implements SignatureProvider {
    @Override
    public void sign(String content) {
        System.out.println("Signed Locally");
    }
}
