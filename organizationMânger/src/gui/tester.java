/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import dto.beecolony;
import dto.colony;
import dto.fptuniversity;
import dto.role;
import dto.university;
        
/**
 *
 * @author chucken
 */
public class tester {
    
    public static void main(String[] args) {
        colony obj1 = new beecolony(2000, "honey", "land");
      
        System.out.println(obj1);
      
        obj1.grow();
      
        obj1.reproduce();
        
        System.out.println("");
        
        university obj2 = new fptuniversity(100000, "FPT", "Cantho");
     
        System.out.println(obj2);

        obj2.enroll();
       
        obj2.educate();
        
        System.out.println("");

        role df = new beecolony(3000, "wasp", "land");

        System.out.println(df);
      
        df.createWork();
        
        System.out.println("");

        df = new fptuniversity(100000, "FPT", "Hanoi");
     
        System.out.println(df);
     
        df.createWork();
    }
}