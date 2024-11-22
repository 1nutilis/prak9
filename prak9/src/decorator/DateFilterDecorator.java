package decorator;

public class DateFilterDecorator extends ReportDecorator {
    public DateFilterDecorator(IReport report) {
        super(report);
    }
    @Override
    public String generate() {
        return "Filtered by Date: " + super.generate();
    }
}

