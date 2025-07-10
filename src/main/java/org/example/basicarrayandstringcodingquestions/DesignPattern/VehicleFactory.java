package org.example.basicarrayandstringcodingquestions.DesignPattern;

public class VehicleFactory {

     public static Vehicle getVehicle(String type){
         if(type.equals( "car"))
             return new Car();
         else if(type.equals("bike"))
             return new Bike();
         else  return null;
     }

    public static void main(String[] args) {


         Vehicle  v  = VehicleFactory.getVehicle("car");
         v.start();
        Vehicle v1  = VehicleFactory.getVehicle("bike");
        v1.start();

    }
}
