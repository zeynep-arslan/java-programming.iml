package day46_encapsulation;

public class Car {
    //encapsulated/hidden instance variables
   private String model;
   private int year;
   private int mileage; //this.mileage


   //setter method for model
    public void setModel(String carModel) {
       model = carModel;
    }
    //getter method for method
    public String getModel(){
       return model;
    }



    //setter for year
    public void setYear(int year){
        this.year = year;
    }

    //getter for year
    public int getYear(){
        return year;
    }

    //getter setter for mileage
    //generate toString

    public int getMileage(){
        return mileage; //this.mileage; also works fine
    }
    //myCar.setMileage(45230);
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public String toString(){
        return "Car => model = "+model;
    }


}
