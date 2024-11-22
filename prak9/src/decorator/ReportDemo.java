package decorator;

public class ReportDemo {
    public static void main(String[] args) {
        IReport salesReport = new SalesReport();
        IReport userReport = new UserReport();

        IReport salesReportWithFilters = new DateFilterDecorator(
                new SortingDecorator(salesReport)
        );

        IReport userReportWithExport = new CsvExportDecorator(userReport);

        System.out.println("Sales Report with Filters:");
        System.out.println(salesReportWithFilters.generate());

        System.out.println("\nUser Report with CSV Export:");
        System.out.println(userReportWithExport.generate());
    }
}
