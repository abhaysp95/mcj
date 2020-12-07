package com.mcj;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/com/mcj/login.fxml"));
		primaryStage.setTitle("mcj login");
		primaryStage.setScene(new Scene(root, 400, 525));
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String ...args) {
		launch(args);
	}
}