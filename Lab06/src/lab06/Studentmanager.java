/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author ADMIN
 */
public class Studentmanager {
    public static void main(String [] args){
        String [] options={"Add new student","Search a studen","Update name and mark","Remove a student","List all","Quit"};
        int choice =0;
        StudentList list=new StudentList();
        do{
            System.out.println("\nStudent manging program");
            choice=Menu.getchoice(options);
            switch(choice){
                case 1: list.addStudent();break;
                case 2:list.searchstudent();break;
                case 3:list.updatestudent();break;
                case 4:list.removestudent();break;
                case 5:list.printall();break;
                default: System.out.println("Bye");
            }
        }
        while(choice>0&&choice<6);
    }
}
