package com.dxctraining.ui;

import java.util.List;

import com.dxctraining.entities.Author;
import com.dxctraining.entities.Book;
import com.dxctraining.entities.BookItem;
import com.dxctraining.entities.Fictional;
import com.dxctraining.exceptions.BookNotFoundExceptions;
import com.dxctraining.exceptions.InvalidArgumentExceptions;
import com.dxctraining.service.Service;
import com .dxctraining.service.ServiceImplement;

public class LibraryUi {
	private ServiceImplement service = new ServiceImplement();
	public static void main(String args[]) {
		LibraryUi l=new LibraryUi();
		l.runapp();
	
	}
	private void runapp() {
		try {
		Author author1=new Author(1,"j.k rowling");
		
		Author author2=new Author(2,"shakespeare");
		
		Book book1=new BookItem("javabeginner",999,author1,9.0,"java");
		service.add(book1);
		Book book2=new BookItem(" python",909,author1,3.3,"python");
		service.add(book2);
		Book book3=new Fictional("harry potter",989,author2,"harry");
		service.add(book3);
		Book book4=new Fictional("avatar",937,author2,"hero");
		service.add(book4);
		
		Book fetched=service.displaybook("2");
		service.updateCost("1", 800);
		service.remove("3");
		display(fetched);
		displayAll();
		}catch(InvalidArgumentExceptions e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch(BookNotFoundExceptions e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
		 e.printStackTrace();
		 System.out.println("some thing wrong");
		}
	}
	public void displayAll() {
		List<Book> list = service.displayallbooks();
		for (Book book : list) {
			display(book);
		}
	}
	public void display(Book book) {
		if (book instanceof BookItem) {
			
		BookItem book1=(BookItem)book;
System.out.println("name=" +book1.getName()+"  cost="+book1.getCost()+"  autour id="+book1.getId()+"   written by"+book1.getAuthour()+"  language" +book1.getLanguage()+"  version"+book1.getVersion());
		
	}
		if (	book instanceof Fictional) {
			
			Fictional book1=(Fictional)book;
	System.out.println("name=" +book1.getName()+"  cost="+book1.getCost()+"  autour id="+book1.getId()+"   written by"+book1.getAuthour()+"  character" +book1.getCharacter());
			
		}
}
}