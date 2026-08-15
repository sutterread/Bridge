package exportformat;

public class PDFExporter implements ExportFormat {
    @Override
    public void export(String content) {
        System.out.println("Exporting in PDF format...");
    }
}
