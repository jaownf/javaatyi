import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculadoraMedia extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label nota1Label = new Label("nota 1:");
        TextField nota1Field = new TextField();

        Label nota2Label = new Label("nota 2:");
        TextField nota2Field = new TextField();

        Button calcularButton = new Button("calcular Média");
        Label resultadoLabel = new Label();

        calcularButton.setOnAction(e -> {
            try {
                double nota1 = Double.parseDouble(nota1Field.getText());
                double nota2 = Double.parseDouble(nota2Field.getText());
                double media = (nota1 + nota2) / 2;
                resultadoLabel.setText("a média é: " + media);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("insira números válidos.");
            }
        });

        grid.add(nota1Label, 0, 0);
        grid.add(nota1Field, 1, 0);
        grid.add(nota2Label, 0, 1);
        grid.add(nota2Field, 1, 1);
        grid.add(calcularButton, 0, 2);
        grid.add(resultadoLabel, 0, 3, 2, 1);

        primaryStage.setScene(new Scene(grid, 300, 200));
        primaryStage.setTitle("calculadora de Média");
        primaryStage.show();
    }
}
