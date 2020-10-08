package PlotlyMain;

import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.TimeSeriesPlot;

import java.io.IOException;
import java.io.InputStream;


public class PlotlyMain {

    public static void main(String[] args) throws IOException {
       MyPlot p = new MyPlot();
       p.createPlot();
    }

}

class MyPlot {
    public void createPlot() throws IOException {
        String fileName = "btsi_flow.csv";
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream file = classLoader.getResourceAsStream(fileName);
        Table btsi = Table.read().csv(file);
        Plot.show(
                TimeSeriesPlot.create("SOME RANDOM DSV FILE KARL GAVE ME", btsi, "DateTime", "btsi_qd"));
    }


}