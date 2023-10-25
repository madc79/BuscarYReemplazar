package dad.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Interfaz extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Buscar y Reemplazar");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(8);

        // Etiquetas
        Label buscarLabel = new Label("Buscar:");
        Label reemplazarLabel = new Label("Reemplazar:");

        // Campos de texto
        TextField buscarField = new TextField();
        TextField reemplazarField = new TextField();

        // Botones
        Button buscarButton = new Button("Buscar");
        Button reemplazarButton = new Button("Reemplazar");
        Button reemplazarTodoButton = new Button("Reemplazar Todo");
        Button cerrarButton = new Button("Cerrar");
        Button ayudaButton = new Button("Ayuda");

        // CheckBoxes para el primer grupo
        CheckBox mayusMinCheckBox = new CheckBox("Mayúsculas y minúsculas");
        CheckBox buscarAtrasCheckBox = new CheckBox("Buscar hacia atrás");

        // CheckBoxes para el segundo grupo
        CheckBox expresionRegularCheckBox = new CheckBox("Expresión regular");
        CheckBox resaltarResultadoCheckBox = new CheckBox("Resaltar resultado");

        // Alinea los campos de texto a la izquierda
        GridPane.setColumnIndex(buscarField, 1);
        GridPane.setColumnIndex(reemplazarField, 1);

        // Hacer que los campos de entrada abarquen solo dos columnas
        GridPane.setColumnSpan(buscarField, 2);
        GridPane.setColumnSpan(reemplazarField, 2);

        // Configura las columnas para los botones
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setHgrow(Priority.ALWAYS);
        buscarButton.setMaxWidth(Double.MAX_VALUE);
        reemplazarButton.setMaxWidth(Double.MAX_VALUE);
        reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
        cerrarButton.setMaxWidth(Double.MAX_VALUE);
        ayudaButton.setMaxWidth(Double.MAX_VALUE);

        // Agregar componentes al GridPane
        grid.add(buscarLabel, 0, 0);
        grid.add(buscarField, 1, 0);
        grid.add(buscarButton, 3, 0);
        grid.add(reemplazarLabel, 0, 1);
        grid.add(reemplazarField, 1, 1);
        grid.add(reemplazarButton, 3, 1);
        grid.add(mayusMinCheckBox, 1, 2);
        grid.add(buscarAtrasCheckBox, 2, 2);
        grid.add(reemplazarTodoButton, 3, 2);
        grid.add(expresionRegularCheckBox, 1, 3);
        grid.add(resaltarResultadoCheckBox, 2, 3);
        grid.add(cerrarButton, 3, 3);
        grid.add(ayudaButton, 3, 4);

        grid.getColumnConstraints().addAll(new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints());

        Scene scene = new Scene(grid, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}














