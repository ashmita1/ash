package Construtor;

public class Car_Example_3 {
	//Class Member Variables & Fields
	String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    int iMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;

    //Default values set in Constructor
    public Car_Example_3(){
    	sModel = "Camry";
    	iMake = 2014;
    	bLeftHandDrive = true;
    }

    public void DisplayCharacterstics(){
    	System.out.println("Model of the Car: " +  sModel);
    	System.out.println("Number of gears in the Car: " +  iGear);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
    	System.out.println("Transmission of the Car: " +  sTransmission);

    }
    
    public static void main(String[] args) {
    	 //Use the Car keyword to declare Car Class variable
    	 Car_Example_3 Toyota = new Car_Example_3();;
    	 
    	 Toyota.iDoors = 4;
    	 Toyota.iGear = 5;
    	 Toyota.iHighestSpeed = 200;
    	 Toyota.iTyres = 4;
    	 Toyota.sColor = "Black";
    	 Toyota.sTransmission = "Manual";
    	 
    	 //Using Car class method
    	 Toyota.DisplayCharacterstics();
    	 
    	 }

}
