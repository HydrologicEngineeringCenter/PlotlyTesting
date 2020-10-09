package webviewer;

import PlotlyMain.MyPlot;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class TheWebViewer extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX WebView Example");
        WebView webView = new WebView();
        MyPlot p = new MyPlot();
        String s = p.createPlot();
//        Determine how to pass the newly created html file into the load function below.
        webView.getEngine().load("file:///C:/PlotyTesting/testoutput/outputd5d88ce5-c0c6-4242-a292-00d2efdd7fb1.html");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 960, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
