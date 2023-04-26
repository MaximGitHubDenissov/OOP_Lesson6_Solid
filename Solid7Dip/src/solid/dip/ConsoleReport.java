package solid.dip;

import java.util.List;

public class ConsoleReport implements Reportable {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to console");
        for (ReportItem item : items) {
            System.out.format("console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
        
    }
    
}
