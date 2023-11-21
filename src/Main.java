import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculatrice");

        GridPane affichage = new GridPane();
        affichage.addColumn(4);
        affichage.addRow(6);
        Scene theScene = new Scene(affichage,400,600,true);

        Label resultat = new Label("Résultat");
        resultat.setFont(Font.font("Cambria", 32));
        resultat.setAlignment(Pos.BASELINE_RIGHT);
        resultat.setPrefSize(affichage.getWidth()-20,100);

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

        // 1ere lign
        affichage.add(resultat,0,0,4,1);
        // 2e ligne
        affichage.add(reset,0,1);
        affichage.add(supp,1,1);
        affichage.add(memoire,2,1);
        affichage.add(diviser,3,1);
        // 3e ligne
        affichage.add(bouton7,0,2);
        affichage.add(bouton8,1,2);
        affichage.add(bouton9,2,2);
        affichage.add(fois,3,2);
        // 4e ligne
        affichage.add(bouton4,0,3);
        affichage.add(bouton5,1,3);
        affichage.add(bouton6,2,3);
        affichage.add(plus,3,3);
        // 5e ligne
        affichage.add(bouton1,0,4);
        affichage.add(bouton2,1,4);
        affichage.add(bouton3,2,4);
        affichage.add(moins,3,4);
        // 6e ligne
        affichage.add(bouton0,0,5);
        affichage.add(virgule,1,5);
        affichage.add(egal,2,5,2,1);

        primaryStage.setScene(theScene);

        primaryStage.show();
    }
    public static void main(String[] args) {
            launch(args);
    }
}