package com.example.master;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    private final ClientService clientService = new ClientService();

    @Override
    public void start(Stage primaryStage) {
        Label inputLabel = new Label("Введите имя клиента:");
        TextField nameField = new TextField();
        Button findButton = new Button("Найти");
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setWrapText(true);

        findButton.setOnAction(e -> {
            String inputName = nameField.getText().trim();
            if (inputName.isEmpty()) {
                resultArea.setText("Введите имя для поиска.");
                return;
            }
            Client foundClient = clientService.findByFirstName(inputName);
            if (foundClient != null) {
                resultArea.setText(foundClient.toString());
            } else {
                resultArea.setText("Клиент не найден.");
            }
        });

        VBox root = new VBox(10, inputLabel, nameField, findButton, resultArea);
        root.setStyle("-fx-padding: 20px; -fx-font-size: 14px;");
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Поиск клиента");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}