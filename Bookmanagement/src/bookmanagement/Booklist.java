/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagement;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class Booklist {
    public void Input(ArrayList<Book> list) {
		System.out.println("---------------The Book's List---------------");
		int y = 1;
		do {
			System.out.print("The Book's code:  ");
			Scanner scanner = new Scanner(System.in);
			String codestring = scanner.nextLine();
			if (codestring == null || codestring == "") {
				break;
			}
			System.out.print("The Book's title: ");
			String titlestring = scanner.nextLine();

			System.out.print("The Book's qua: ");
			int qua = scanner.nextInt();

			System.out.print("The Book's price: ");
			double price = scanner.nextDouble();

			list.add(new Book(codestring, titlestring, qua, price));
			System.out.println("\nDo you have another book?(1: yes || 0 : No)");
			y = scanner.nextInt();

		} while (y == 1);

	}

	public void Display(ArrayList<Book> list) {
		for (Book book : list) {
			System.out.println(book);
		}
	}

	public void Search(ArrayList<Book> list) {
		System.out.print("The Book's code: ");
		String number = new Scanner(System.in).nextLine();
		boolean s = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodestring().equals(number)) {
				s= true;
				System.out.println(list.get(i));
			}

		}
		if (s == false) {
			System.out.println("\nThe library don't have that book ");
		}

	}
	private void Remove(ArrayList<Book> list) {
		System.out.print("The Book's code: ");
		String number = new Scanner(System.in).nextLine();
		boolean s= false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodestring().equals(number)) {
				s= true;
				list.remove(i);
			}

		}
		if (s == false) {
			System.out.println("\nThe library don't have that book ");
		}
	}

	private void SortAscending(ArrayList<Book> list) {
		Collections.sort(list,new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getCodestring().compareTo(o2.getCodestring());
			}
			
		});
		Display(list);
	}

	private void Max(ArrayList<Book> list) {
		Book max = list.get(0);
		for (Book book : list) {
			if (max.getPrice() < book.getPrice()) {
				max = book;
			}
		}
		System.out.println("The first max value is : "+max);
	}

	private void Update(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		System.out.print("The Book's code: ");
		String number = new Scanner(System.in).nextLine();
		boolean s = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodestring().equals(number)) {
				s = true;
				System.out.println("The new price: ");
				double newprice = new Scanner(System.in).nextDouble();
				list.get(i).setPrice(newprice);
			}

		}
		if (s == false) {
			System.out.println("\nThe library don't have that book ");
		}
	}



	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Booklist booklist = new Booklist();
		do {
			System.out.println("-----------------MENU-----------------");
			System.out.println("1.	Input & add book(s) to the end.");
			System.out.println("2.	Display all books.");
			System.out.println("3.	Search a book for given code.");
			System.out.println("4.	Update the book’s price for given code.");
			System.out.println("5.	Find the (first) max price value.");
			System.out.println("6.	Sort the list ascendingly by code.");
			System.out.println("7.	Remove the book having given code.");
			System.out.println("0.	Exit.");
			System.out.println("--------------------------------------");
			System.out.print("Choice ? \n");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {

				booklist.Input(list);
				break;

			}
			case 2: {
				booklist.Display(list);
				break;
			}
			case (0): {
				System.exit(0);
				break;
			}
			case 3: {
				booklist.Search(list);
				break;

			}
			case 4: {
				booklist.Update(list);
				break;
			}
			case 5: {
				booklist.Max(list);
				break;
			}
			case 6: {
				booklist.SortAscending(list);
				break;
			}
			case 7: {
				booklist.Remove(list);
				break;
			}

			default:
				System.out.println("You are wrong");
			}

		} while (true);

	}
    
}

