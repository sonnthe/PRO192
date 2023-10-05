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
public class Vase extends Item{
   private int height;
   private String material;

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
   public void inputVase(){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter height:");
       this.height=sc.nextInt();
       System.out.print("Enter Material:");
       this.material=sc.nextLine();
   }
   public void outputVase(){
       System.out.print("Height:"+this.height);
       System.out.print("Material:"+this.material);
       
   }
}
