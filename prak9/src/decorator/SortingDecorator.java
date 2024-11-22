package decorator;

public class SortingDecorator extends ReportDecorator {
    public SortingDecorator(IReport report) {
        super(report);
    }
    @Override
    public String generate() {
        return "Sorted Data: " + super.generate();
    }
}
