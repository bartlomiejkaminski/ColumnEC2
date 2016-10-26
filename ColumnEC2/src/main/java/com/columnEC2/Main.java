package com.columnEC2;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {

	public static void main(String[] args) {
		launch(args);	
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			primaryStage.setTitle("Słup żelbetowy wg EC2");
			Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			scene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
			primaryStage.setResizable(false);
			primaryStage.sizeToScene();
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}