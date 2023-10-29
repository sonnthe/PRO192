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
public class Student {
    String code;
    String name;
    int mark=0;

    public Student() {
    }

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark=(mark>=0&&mark<=10)?mark:0;
    }

    @Override
    public String toString() {
        return code+","+name+","+mark;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        name=name.trim().toUpperCase();
        if(name.length()>0)this.name=name;
    }

    public int getMark() {
        return mark;
    }
    public void setMark(int mark){
        if(mark>=0&&mark<=10)this.mark=mark;
    }
    
}
