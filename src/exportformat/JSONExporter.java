package exportformat;

public class JSONExporter implements ExportFormat {
    @Override
    public void export(String content) {
        System.out.println("Exporting in JSON format...");
    }
}
