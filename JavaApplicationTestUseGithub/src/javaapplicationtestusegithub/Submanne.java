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
public class Submanne extends Vehicle{
    public void refuel(){
        System.out.println("Refuel");
        fuelLevel = fuelLevel+100;
    }
    public int getFuel(){
        return fuelLevel;
    }
    public Submanne(){
        System.out.println("Hello i am Submanne");
        fuelLevel =0 ;
    }
}
