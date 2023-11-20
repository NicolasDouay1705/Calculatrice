import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
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

        Label resultat = new Label("Résultat");

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
        Button virgule = new Button(",");
        Button plus = new Button("+");
        Button moins = new Button("-");
        Button fois = new Button("*");
        Button diviser = new Button(":");
        Button egal = new Button("=");
        Button reset = new Button("AC");
        Button supp = new Button("C");
        Button memoire = new Button("M+/M-");

        resultat.setPrefSize(400,100);
        bouton0.setPrefSize(100,100);
        bouton1.setPrefSize(100,100);
        bouton2.setPrefSize(100,100);
        bouton3.setPrefSize(100,100);
        bouton4.setPrefSize(100,100);
        bouton5.setPrefSize(100,100);
        bouton6.setPrefSize(100,100);
        bouton7.setPrefSize(100,100);
        bouton8.setPrefSize(100,100);
        bouton9.setPrefSize(100,100);
        virgule.setPrefSize(100,100);
        plus.setPrefSize(100,100);
        moins.setPrefSize(100,100);
        fois.setPrefSize(100,100);
        diviser.setPrefSize(100,100);
        egal.setPrefSize(200,100);
        reset.setPrefSize(100,100);
        supp.setPrefSize(100,100);
        memoire.setPrefSize(100,100);

        FlowPane affichage = new FlowPane();


        affichage.getChildren().add(resultat); // 1ere ligne
        affichage.getChildren().addAll(reset,supp,memoire,diviser); // 2e ligne
        affichage.getChildren().addAll(bouton7,bouton8,bouton9,fois); // 3e ligne
        affichage.getChildren().addAll(bouton4,bouton5,bouton6,plus); // 4e ligne
        affichage.getChildren().addAll(bouton1,bouton2,bouton3,moins); // 5e ligne
        affichage.getChildren().addAll(bouton0,virgule,egal); // 6e ligne

        Scene theScene = new Scene(affichage,400,600,true);
        primaryStage.setScene(theScene);


        primaryStage.show();
    }
    public static void main(String[] args) {
            launch(args);
    }
}