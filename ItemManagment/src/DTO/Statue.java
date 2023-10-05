/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Statue extends Item {
     private int weight;
   private String colour;

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
   public void inputStatue(){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter weight:");
       this.weight=sc.nextInt();
       System.out.print("Enter colour:");
       this.colour=sc.nextLine();
   }
   public void outputStatue(){
       System.out.print("Weight:"+this.weight);
       System.out.print("Colour:"+this.colour);
       
   }
}


