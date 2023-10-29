/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class StudentList extends ArrayList<Student> {

    public StudentList() {
        super();
    }
    public Student search(String code){
      for(int i=0;i<this.size();i++)
          if (this.get(i).getCode().equals(code))return this.get(i);
      return null;
    }
    public boolean iscodedupplicated(String code){
        code=code.trim().toUpperCase();
        return search(code)!=null;
    }
    public void addStudent(){
        String newCode;
        String newName;
        int newMark;
        boolean codedupplicated=false;
        do{
            newCode=Inputter.inputpattern("St.code S000:","[sS][\\d]{3}");
            newCode=newCode.trim().toUpperCase();
            codedupplicated=iscodedupplicated(newCode);
            if(codedupplicated)System.out.print("Code is duplicated");
        }
        while(codedupplicated==true);
       newName=Inputter.inputnonblankStr("Name of new student:");
       newName=newName.toUpperCase();
       newMark=Inputter.inputInt("mark:",0,10);
       Student st=new Student(newCode,newName,newMark);
       this.add(st);
       System.out.println("Student"+newCode+"has been added");
    }
    public void searchstudent(){
        if(this.isEmpty())
            System.out.print("Empty list");
        else{
            String scode=Inputter.inputStr("Input student code:");
            Student st=this.search(scode);
            if(st==null)
                System.out.println("Student doesnt exist");
            else System.out.print("Found:"+st);
        }
    }
    public void updatestudent(){
        if(this.isEmpty())
            System.out.println("Empty list");
        else{
            String ucode=Inputter.inputStr("Input code of updated student:");
            Student st=this.search(ucode);
            if(st==null)
                System.out.println("Student doensnt exist");
            else{
                String oldname=st.getName();
                String newname=Inputter.inputStr("old name:"+oldname+",new name:");
                st.setName(newname);
                int oldmark=st.getMark();
                String msg="old mark:"+oldmark+",new mark";
                int newmark=Inputter.inputInt(msg,0,10);
                st.setMark(newmark);
                System.out.println("Student has been updated");
            }
        }
    }
    public void removestudent(){
        if(this.isEmpty())
            System.out.println("Empty list");
        else{
            String rcode=Inputter.inputStr("Input code of removed student");
            Student st=this.search(rcode);
            if(st==null)
                System.out.println("Student doesnt exist");
            else{
                this.remove(st);
                System.out.println("Student has been removed");
            }
        }
    }
    public void printall(){
        if(this.isEmpty())
            System.out.println("Empty list");
        else{
            System.out.println("Student list:");
            for(Student st:this)System.out.println(st);
            System.out.println("Total:"+this.size()+"student(s)");
        }
    }
}
