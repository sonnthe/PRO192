/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagement;

/**
 *
 * @author ADMIN
 */

public class Book {
    private String codestring; 
	private String titlestring; 
	private int qua; 
	private double price; 
	public Book() {
		super();
	}
	public Book(String codestring, String titlestring, int qua, double price) {
		super();
		this.codestring = codestring;
		this.titlestring = titlestring;
		this.qua = qua;
		this.price = price;
	}
	public String getCodestring() {
		return codestring;
	}
	public void setCodestring(String codestring) {
		this.codestring = codestring;
	}
	public String getTitlestring() {
		return titlestring;
	}
	public void setTitlestring(String titlestring) {
		this.titlestring = titlestring;
	}
	public int getQua() {
		return qua;
	}
	public void setQua(int qua) {
		this.qua = qua;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("Book: %s\t %s \t %d \t %f ", codestring,titlestring,qua, price);
	}
}
    

