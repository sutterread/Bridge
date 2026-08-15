package signatureprovider;

public class CloudSignature implements SignatureProvider {
    @Override
    public void sign(String content) {
        System.out.println("Signing on cloud...");
    }
}
