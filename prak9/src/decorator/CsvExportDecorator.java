package decorator;

public class CsvExportDecorator extends ReportDecorator {
    public CsvExportDecorator(IReport report) {
        super(report);
    }
    @Override
    public String generate() {
        return "CSV Export: " + super.generate();
    }
}

