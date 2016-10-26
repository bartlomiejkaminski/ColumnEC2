package com.columnEC2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class ControllerParametersColumnPane implements Initializable {
	
	@FXML
	Pane paneRectangleOrCircle;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			Pane newLoadedPane = FXMLLoader.load(getClass().getResource("ParametersForRectangle.fxml"));
			paneRectangleOrCircle.getChildren().add(newLoadedPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
