/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
 
public class beecolony extends colony implements role {
    protected String type;
   
    public beecolony() {
    }

    public beecolony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "The colony's type is: " + this.type + " ,size is about: " + this.size + "And the place is: " + this.place;
    }

    @Override
    public void createWork() {
        System.out.println("Worker bees perform all the work of the bees ");
    }
}