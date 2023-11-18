import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.regex.Pattern;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculatrice");

        Text resultat = new Text("Résultat");
        Button bouton0 = new Button("0");
        Button bouton1 = new Button("1");
        Button bouton2 = new Button("2");
        Button bouton3 = new Button("3");
        Button bouton4 = new Button("4");
        Button bouton5 = new Button("5");
        Button bouton6 = new Button("6");
        Button bouton7 = new Button("7");
        Button bouton8 = new Button("8");
        Button bouton9 = new Button("9");

        bouton0.setMaxSize(100,100);
        bouton1.setMaxSize(100,100);
        bouton2.setMaxSize(100,100);
        bouton3.setMaxSize(100,100);
        bouton4.setMaxSize(100,100);
        bouton5.setMaxSize(100,100);
        bouton6.setMaxSize(100,100);
        bouton7.setMaxSize(100,100);
        bouton8.setMaxSize(100,100);
        bouton9.setMaxSize(100,100);

        TilePane root = new TilePane();
        root.setPrefTileWidth(100);
        root.setPrefTileHeight(100);

        root.getChildren().addAll(resultat,bouton0,bouton1,bouton2,bouton3,bouton4,bouton5,bouton6,bouton7,bouton8,bouton9);
        Scene theScene = new Scene(root,400,400,true);
        primaryStage.setScene(theScene);


        primaryStage.show();
    }
    public static void main(String[] args) {
            launch(args);
    }
}