package com.mcj;

import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class Client {
	private String username, address;
	private int port;

	Client(String username, String address, int port) {
		this.username = username;
		this.address = address;
		this.port = port;
		createClientWindow();
	}

	private void createClientWindow() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/com/mcj/client.fxml"));
			Stage clientStage = new Stage();
			clientStage.setTitle("MCJ");
			clientStage.setScene(new Scene(root, 880, 550));
			clientStage.show();
		}
		catch (IOException ioe) {
			System.out.println("IOException while creating Client Window: \n" + ioe);
		}
	}
}
