package com.columnEC2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Column {
	
	// MATERIAL PARAMETERS
	// Concrete
	IntegerProperty 	strengthOfConcreteFck 	= new SimpleIntegerProperty();	// [MPa]
	StringProperty 		nameStrengthOfConcrete  = new SimpleStringProperty();	// Text
	// Reinforcing steel
	IntegerProperty 	strengthOfSteelFyk 	= new SimpleIntegerProperty();	// [MPa]
	StringProperty		nameStrengthOfSteel	= new SimpleStringProperty();	// Text
	
	
	//DIMENSIONS	
	// Rectangle
	IntegerProperty 	widthRectangle 		= new SimpleIntegerProperty();	// [cm]
	IntegerProperty 	heightRectangle 	= new SimpleIntegerProperty();	// [cm]
	IntegerProperty 	distanceARectangle 	= new SimpleIntegerProperty();	// [cm]
	// Circle
	IntegerProperty 	diameterCircle 		= new SimpleIntegerProperty();	// [cm]
	IntegerProperty 	distanceACircle 	= new SimpleIntegerProperty();	// [cm]


	//CALCULATION PARAMETERS
	StringProperty 		nameExposureClass  	= new SimpleStringProperty();	// Text
	DoubleProperty	 	coatingOfSteel 		= new SimpleDoubleProperty();	// [mm]
	StringProperty 		nameStructureClass  	= new SimpleStringProperty();	// Text
	IntegerProperty 	label1 			= new SimpleIntegerProperty();	// [mm]
	IntegerProperty 	label2 			= new SimpleIntegerProperty();	// [mm]
	IntegerProperty 	label3 			= new SimpleIntegerProperty();	// [mm]
	IntegerProperty 	label4 			= new SimpleIntegerProperty();	// [mm]	
	DoubleProperty 		creepRate		= new SimpleDoubleProperty();	// [-]	effective creep rate
	
	//LOADS
	DoubleProperty	 	compressiveForce 	= new SimpleDoubleProperty();
	DoubleProperty	 	bendingMoment 		= new SimpleDoubleProperty();
	DoubleProperty	 	computationalHeight 	= new SimpleDoubleProperty();
	
	
	
	// Strength of concrete fck GETTERS and SETTERS
	public IntegerProperty strengthOfConcreteFckProperty(){
		 if (strengthOfConcreteFck == null) strengthOfConcreteFck = new SimpleIntegerProperty(this, "strengthOfConcreteFck");
        return strengthOfConcreteFck; 
	}
	
	public int getStrengthOfConcreteFck(){
		return strengthOfConcreteFckProperty().get();
	}
	
	public void setStrengthOfConcreteFck(int strengthOfConcreteFck){
		strengthOfConcreteFckProperty().set(strengthOfConcreteFck);
	}
	
	
	
	// Strength of concrete fck GETTERS and SETTERS
	public IntegerProperty strengthOfSteelFykProperty(){
		 if (strengthOfSteelFyk == null) strengthOfSteelFyk = new SimpleIntegerProperty(this, "strengthOfSteelFyk");
        return strengthOfSteelFyk; 
	}
	
	public int getStrengthOfSteelFyk(){
		return strengthOfSteelFykProperty().get();
	}
	
	public void setStrengthOfSteelFyk(int strengthOfSteelFyk){
		strengthOfSteelFykProperty().set(strengthOfSteelFyk);
	}
	
	
	
	// Name strength of concrete fck GETTERS and SETTERS
	public StringProperty nameStrengthOfConcreteProperty(){
		 if (nameStrengthOfConcrete == null) nameStrengthOfConcrete = new SimpleStringProperty(this, "nameStrengthOfConcrete");
        return nameStrengthOfConcrete; 
	}
	
	public String getNameStrengthOfConcrete(){
		return nameStrengthOfConcreteProperty().get();
	}
	
	public void setNameStrengthOfConcrete(String nameStrengthOfConcrete){
		nameStrengthOfConcreteProperty().set(nameStrengthOfConcrete);
	}
	
	
	
	// Name strength of steel fyk GETTERS and SETTERS
	public StringProperty nameStrengthOfSteelProperty(){
		 if (nameStrengthOfSteel == null) nameStrengthOfSteel = new SimpleStringProperty(this, "nameStrengthOfSteel");
        return nameStrengthOfSteel; 
	}
	
	public String getNameStrengthOfSteel(){
		return nameStrengthOfSteelProperty().get();
	}
	
	public void setNameStrengthOfSteel(String nameStrengthOfSteel){
		nameStrengthOfSteelProperty().set(nameStrengthOfSteel);
	}
	
	
	
	// Width rectangle GETTERS and SETTERS
	public IntegerProperty widthRectangleProperty(){
		 if (widthRectangle == null) widthRectangle = new SimpleIntegerProperty(this, "widthRectangle");
        return widthRectangle; 
	}
	
	public int getWidthRectangle(){
		return widthRectangleProperty().get();
	}
	
	public void setWidthRectangle(int widthRectangle){
		widthRectangleProperty().set(widthRectangle);
	}
	
	
	
	// Height rectangle GETTERS and SETTERS
	public IntegerProperty heightRectangleProperty(){
		 if (heightRectangle == null) heightRectangle = new SimpleIntegerProperty(this, "heightRectangle");
        return heightRectangle; 
	}
	
	public int getHeightRectangle(){
		return heightRectangleProperty().get();
	}
	
	public void setHeightRectangle(int heightRectangle){
		heightRectangleProperty().set(heightRectangle);
	}
	
	
	
	// Distance a rectangle GETTERS and SETTERS
	public IntegerProperty distanceARectangleProperty(){
		 if (distanceARectangle == null) distanceARectangle = new SimpleIntegerProperty(this, "distanceARectangle");
        return distanceARectangle; 
	}
	
	public int getDistanceARectangle(){
		return distanceARectangleProperty().get();
	}
	
	public void setDistanceARectangle(int distanceARectangle){
		distanceARectangleProperty().set(distanceARectangle);
	}
	
	
	
	// Diameter circle GETTERS and SETTERS
	public IntegerProperty diameterCircleProperty(){
		 if (diameterCircle == null) diameterCircle = new SimpleIntegerProperty(this, "diameterCircle");
        return diameterCircle; 
	}
	
	public int getDiameterCircle(){
		return diameterCircleProperty().get();
	}
	
	public void setDiameterCircle(int diameterCircle){
		diameterCircleProperty().set(diameterCircle);
	}
	
	
	
	// Distance "a" circle GETTERS and SETTERS
	public IntegerProperty distanceACircleProperty(){
		 if (distanceACircle == null) distanceACircle = new SimpleIntegerProperty(this, "distanceACircle");
        return distanceACircle; 
	}
	
	public int getDistanceACircle(){
		return distanceACircleProperty().get();
	}
	
	public void setDistanceACircle(int distanceACircle){
		distanceACircleProperty().set(distanceACircle);
	}
	
	
	
	// Name exposure class GETTERS and SETTERS
	public StringProperty nameExposureClassProperty(){
		 if (nameExposureClass == null) nameExposureClass = new SimpleStringProperty(this, "nameExposureClass");
        return nameExposureClass; 
	}
	
	public String getNameExposureClass(){
		return nameExposureClassProperty().get();
	}
	
	public void setNameExposureClass(String nameExposureClass){
		nameExposureClassProperty().set(nameExposureClass);
	}
	
	
	
	// Coating of steel GETTERS and SETTERS
	public DoubleProperty coatingOfSteelProperty(){
		 if (coatingOfSteel == null) coatingOfSteel = new SimpleDoubleProperty(this, "coatingOfSteel");
        return coatingOfSteel; 
	}
	
	public double getCoatingOfSteel(){
		return coatingOfSteelProperty().get();
	}
	
	public void setCoatingOfSteel(double coatingOfSteel){
		coatingOfSteelProperty().set(coatingOfSteel);
	}
	
	
	
	// Name structure class GETTERS and SETTERS
	public StringProperty nameStructureClassProperty(){
		 if (nameStructureClass == null) nameStructureClass = new SimpleStringProperty(this, "nameStructureClass");
        return nameStructureClass; 
	}
	
	public String getNameStructureClass(){
		return nameStructureClassProperty().get();
	}
	
	public void setNameStructureClass(String nameStructureClass){
		nameStructureClassProperty().set(nameStructureClass);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// CONSTRUCTOR FOR RECTANGLE
	public Column(int strenghtOfConcreteFck){
		setStrengthOfConcreteFck(strenghtOfConcreteFck);
	}
	
	// CONSTRUCTOR FOR CIRCLE
	public Column(){
		// Circle
	}
	
}
