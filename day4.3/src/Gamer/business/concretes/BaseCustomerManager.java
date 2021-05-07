package Gamer.business.concretes;

import Gamer.dataAccess.abstracts.CustomerDao;
import Gamer.entities.concretes.Customer;

public class BaseCustomerManager implements CustomerDao {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated to db : " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("deleted to db : " + customer.getFirstName());
		
	}

}
