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
public class Helicopter extends Vehicle{
    public void refuel(){
        System.out.println("Refuel");
        fuelLevel = fuelLevel+500;
    }
    public int getFuel(){
        return fuelLevel;
    }
    public void move(){
        System.out.println("Fly Fly Fly!");
        fuelLevel = fuelLevel+20;
    }
    public Helicopter(){
        System.out.println("Hello i am Helicopter");
        fuelLevel = 0;
    }
}
