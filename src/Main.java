import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculatrice");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane,400,500,true);
        primaryStage.setScene(theScene);

        primaryStage.show();
    }
    public static void main(String[] args) {
            launch(args);
    }
}