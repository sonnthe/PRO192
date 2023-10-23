/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

abstract public class organiztion {
    protected int size;

    public organiztion() {
    }

    public organiztion(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public abstract void communucateByTool();

    @Override
    public String toString() {
        return "The Organization's size is: " + size;  
    }
}