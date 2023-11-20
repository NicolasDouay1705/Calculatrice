import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.awt.*;
import java.util.regex.Pattern;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculatrice");

        Label resultat = new Label("Résultat");
        resultat.setFont(Font.font("Cambria", 32));
        resultat.setAlignment(Pos.BASELINE_RIGHT);
        resultat.setPrefSize(380,100);

        Button bouton0 = new Button("0");
        bouton0.setPrefSize(100,100);
        bouton0.setFont(Font.font("Cambria",32));

        Button bouton1 = new Button("1");
        bouton1.setPrefSize(100,100);
        bouton1.setFont(Font.font("Cambria",32));

        Button bouton2 = new Button("2");
        bouton2.setPrefSize(100,100);
        bouton2.setFont(Font.font("Cambria",32));

        Button bouton3 = new Button("3");
        bouton3.setPrefSize(100,100);
        bouton3.setFont(Font.font("Cambria",32));

        Button bouton4 = new Button("4");
        bouton4.setPrefSize(100,100);
        bouton4.setFont(Font.font("Cambria",32));

        Button bouton5 = new Button("5");
        bouton5.setPrefSize(100,100);
        bouton5.setFont(Font.font("Cambria",32));

        Button bouton6 = new Button("6");
        bouton6.setPrefSize(100,100);
        bouton6.setFont(Font.font("Cambria",32));

        Button bouton7 = new Button("7");
        bouton7.setPrefSize(100,100);
        bouton7.setFont(Font.font("Cambria",32));

        Button bouton8 = new Button("8");
        bouton8.setPrefSize(100,100);
        bouton8.setFont(Font.font("Cambria",32));

        Button bouton9 = new Button("9");
        bouton9.setPrefSize(100,100);
        bouton9.setFont(Font.font("Cambria",32));

        Button virgule = new Button(",");
        virgule.setPrefSize(100,100);
        virgule.setFont(Font.font("Cambria",32));

        Button plus = new Button("+");
        plus.setPrefSize(100,100);
        plus.setFont(Font.font("Cambria",32));

        Button moins = new Button("-");
        moins.setPrefSize(100,100);
        moins.setFont(Font.font("Cambria",32));

        Button fois = new Button("*");
        fois.setPrefSize(100,100);
        fois.setFont(Font.font("Cambria",32));

        Button diviser = new Button(":");
        diviser.setPrefSize(100,100);
        diviser.setFont(Font.font("Cambria",32));

        Button egal = new Button("=");
        egal.setPrefSize(200,100);
        egal.setFont(Font.font("Cambria",32));

        Button reset = new Button("AC");
        reset.setPrefSize(100,100);
        reset.setFont(Font.font("Cambria",32));

        Button supp = new Button("C");
        supp.setPrefSize(100,100);
        supp.setFont(Font.font("Cambria",32));

        Button memoire = new Button("M+/M-");
        memoire.setPrefSize(100,100);
        memoire.setFont(Font.font("Cambria",20));


        FlowPane affichage = new FlowPane();


        affichage.getChildren().add(resultat);  // 1ere ligne
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