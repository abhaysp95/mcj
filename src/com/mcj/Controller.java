package com.mcj;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class Controller {
	@FXML private TextField enteredName;
	@FXML private TextField enteredAddress;
	@FXML private TextField enteredPort;
	@FXML private ActionEvent event;
	@FXML private Button loginButton;

	public void perfomLogin(ActionEvent event) {
		this.event = event;
		String username = enteredName.getText();
		String address = enteredAddress.getText();
		int port = Integer.parseInt(enteredPort.getText());
		login(username, address, port);
	}

	private void login(String username, String address, int port) {
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
		System.out.println("Name: " + username + "\n"
				+ "Address: " + address + "\n"
				+ "Port: " + port);
	}
}