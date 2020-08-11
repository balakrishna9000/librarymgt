package com.dxctraining.service;

import java.util.List;
import com.dxctraining.dao.Dao;
import com.dxctraining.entities.Book;
import com.dxctraining.exceptions.InvalidArgumentExceptions;

@Service
public class ServiceImplement implements Service {
	private Dao dao = new DaoImplement();

	@Override
	public Book displaybook(String id) {
		checkId(id);
		Book book = dao.displaybook(id);
		return book;
	}

	@Override
	public List<Book> displayallbooks() {

		List<Book> list = dao.displayallbooks();
		return list;

	}

	public Book checkId(String id) {
		int idno= Integer.int(id);
		if(idno<=0) {
			throw new InvalidArgumentExceptions("id cannot be less than zero"+id );
		}

		
	public void checkName(String name) {
			if (name == null || name.isEmpty()) {
				throw new InvalidArgumentExceptions("name cant be  empty");
			}
		}
		
	public void checkBook(Book book) {
			if(book==null) {
				throw new InvalidArgumentExceptions("Book cant be null");
					
			}
		}
	public void checkCost(double cost) {
		 Double newCost=cost;
		 if(newCost==null) {
			 throw new InvalidArgumentExceptions("cost cant be null");
		}
		
	@Override
	public Book updateCost(String id,double updatedcost) {
			checkId(id);
			checkCost(updatedcost);
			Book book = dao.updateCost(id, updatedcost);
		    return book;
		}

	     @Override
		public void add(Book book) {
			checkBook(book);
			dao.add(book);
			
		}

         @Override		
		public void remove(String id) {
		  checkId(id);	
		  dao.removebook(id);		
		}


	}
		
	}

	@Override
	public com.dxctraining.service.Book displaybook(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.dxctraining.service.Book updateCost(String id, double newCost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(com.dxctraining.service.Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public com.dxctraining.service.Book displaybook(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.dxctraining.service.Book updateCost(String id, double newCost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(com.dxctraining.service.Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public com.dxctraining.service.Book displaybook(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.dxctraining.service.Book updateCost(String id, double newCost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(com.dxctraining.service.Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.dxctraining.service.Book displaybook(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.dxctraining.service.Book updateCost(String id, double newCost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(com.dxctraining.service.Book book) {
		// TODO Auto-generated method stub
		
	}

}
