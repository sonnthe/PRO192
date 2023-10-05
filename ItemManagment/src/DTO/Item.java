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
public class Item {
    private int value;
    private String creator;

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Next value:");
        this.value=sc.nextInt();
        System.out.print("Next creator:");
        this.creator=sc.nextLine();
    }
    public void output(){
        System.out.print("Value:"+ this.value);
        System.out.print("Creator:"+ this.creator);
        
    }
}
