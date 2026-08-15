package exportformat;

public class XMLExporter implements ExportFormat {
    @Override
    public void export(String content) {
        System.out.println("Exporting in XML format...");
    }
}
