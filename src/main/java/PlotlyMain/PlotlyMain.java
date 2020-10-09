package PlotlyMain;

import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.TimeSeriesPlot;
import tech.tablesaw.plotly.components.Figure;

import java.io.IOException;
import java.io.InputStream;


public class PlotlyMain {

    public static void main(String[] args) throws IOException {
       MyPlot p = new MyPlot();
       p.createPlot();
    }

}

