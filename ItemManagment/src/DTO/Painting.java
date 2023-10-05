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
public class Painting extends Item {
    private int height;
    private int width;
    boolean isWatercolour;
    boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    

  

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void inputPainting(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height:");
        this.height=sc.nextInt();
        System.out.print("Enter width:");
        this.width=sc.nextInt();
        System.out.print("Enter isWatercolour:");
        this.isWatercolour=sc.nextBoolean();
        System.out.print("Enter isFramed:");
        this.isFramed=sc.nextBoolean();
         
    }
    public void outputPainting(){
        System.out.print("Height:"+this.height);
        System.out.print("Wifth:"+this.width);
        System.out.print("isWatercolour:"+this.isWatercolour);
        System.out.print("isFramed:"+this.isFramed);
    }
}
