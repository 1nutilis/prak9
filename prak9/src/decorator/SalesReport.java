package decorator;

public class SalesReport implements IReport {
    @Override
    public String generate() {
        return "Sales Report Data";
    }
}
