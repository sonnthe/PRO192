/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;



/**
 *
 * @author chucken
 */
public class colony extends organiztion {
    
    protected String place;

    public colony() {
    }

    public colony(int size, String place) {
        super(size);
        this.place = place;
    }
    
    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring");
    }
    
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "The colony size is: " + size + "The colony's place is: " + place;
    }   

    @Override
    public void communucateByTool() {
        System.out.println("The colony communicate by sound");
    }
}