package com.columnEC2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.shape.Rectangle;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

public class ControllerParametersForRectangle implements Initializable {
	

	@FXML Rectangle rectangle;	
	@FXML TextField widthRectangle;	
	@FXML TextField heightRectangle;

	StringConverter	<Double> converter 			= new DoubleStringConverter();
	TextFormatter	<Double> widthFromatter 	= new TextFormatter<Double>(converter);
	TextFormatter	<Double> heightFromatter 	= new TextFormatter<Double>(converter);
    
	
	public int getValueWidthRectangle(){
		return Integer.parseInt(widthRectangle.getText());
	}
	
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			
		widthRectangle.setTextFormatter(widthFromatter);
		heightRectangle.setTextFormatter(heightFromatter);	
				
		widthFromatter.valueProperty().bindBidirectional(rectangle.widthProperty().asObject());
		heightFromatter.valueProperty().bindBidirectional(rectangle.heightProperty().asObject());
	}	
}
