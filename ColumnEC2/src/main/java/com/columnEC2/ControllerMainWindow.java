package com.columnEC2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class ControllerMainWindow implements Initializable{
	
	@FXML
	private Pane loadPane;
	
	@FXML
	private void loadStartPane(ActionEvent event) throws IOException{
			Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("StartPane.fxml"));
			loadPane.getChildren().clear();
			loadPane.getChildren().add(newLoadedPane);	
	}
	
	
	
	@FXML
	private void loadSectionTypePane(ActionEvent event) throws IOException{
			Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("SectionTypePane.fxml"));
			loadPane.getChildren().clear();
			loadPane.getChildren().add(newLoadedPane);			
	}
	
	
	
	@FXML
	private void loadLoadPane(ActionEvent event) throws IOException{
			Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("LoadPane.fxml"));
			loadPane.getChildren().clear();
			loadPane.getChildren().add(newLoadedPane);			
	}
	
	
	
	@FXML
	private void loadResultsPane(ActionEvent event) throws IOException{
			Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("ResultsPane.fxml"));
			loadPane.getChildren().clear();
			loadPane.getChildren().add(newLoadedPane);			
	}
	
	
	
	@FXML
	private void loadParametersColumnPane(ActionEvent event) throws IOException{
			Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("ParametersColumnPane.fxml"));
			loadPane.getChildren().clear();
			loadPane.getChildren().add(newLoadedPane);			
	}
	
	

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		try {
			Pane newLoadedPane = FXMLLoader.load(getClass().getResource("StartPane.fxml"));
			loadPane.getChildren().add(newLoadedPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
