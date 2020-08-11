package com.dxctraining.service;


import java.util.List;

import com.dxctraining.entites.Book;

public interface Service {
	
	public Book displaybook(String id);
	public List<Book> displayallbooks();
	public Book updateCost(String id,double newCost);
	public void add(Book book);
	public void remove(String id);
}