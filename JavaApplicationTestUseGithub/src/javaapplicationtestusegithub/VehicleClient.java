/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationtestusegithub;

/**
 *
 * @author Cybermanone
 */
public class VehicleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehicleCreator creator = new VehicleCreator();
        int fuelLevel;
        //------------------
        System.out.println("****Produce Frist Masterpiece****");
        Vehicle heilcopter = creator.CreateVehicle("Heilcopter");
        heilcopter.refuel();
        fuelLevel = heilcopter.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        heilcopter.move();
        fuelLevel = heilcopter.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        //------------------
        System.out.println("****Produce Second Masterpiece****");
        Vehicle submarine = creator.CreateVehicle("Submarine");
        submarine.refuel();
        fuelLevel = submarine.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        submarine.move();
        fuelLevel = submarine.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        //------------------
        System.out.println("****Produce Third Masterpiece****");
        Vehicle sportCar = creator.CreateVehicle("Sport Car");
    }
    
}
