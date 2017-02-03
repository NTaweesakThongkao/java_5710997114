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
public class VehicleCreator {
   public Vehicle CreateVehicle(String order){
       if(order.equals("Heilcopter")){
           return (new Helicopter());
       }else{
           if(order.equals("Submarine")){
               return (new Submanne());
           }else{
                System.out.println("Out of Spec");
                return(null);
           }
       }
       //return (null);
   }
}
