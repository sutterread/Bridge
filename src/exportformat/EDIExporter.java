package exportformat;

public class EDIExporter implements ExportFormat{
    @Override
    public void export(String content) {
        System.out.println("EDI Exporting...");
    }
}
