/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Menu {
    public static int getchoice(ArrayList options){
        for(int i=0; i<options.size();i++){
            System.out.print((i+1)+"-"+options.get(i));
        }
        System.out.print("Choose 1.."+options.size()+":");
        Scanner sc=new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    public static int getchoice(Object[] options){
        for(int i=0;i<options.length;i++){
            System.out.print((i+1)+"-"+options[i]);
        }
        System.out.print("Choose 1.."+options.length+":");
        Scanner sc=new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
