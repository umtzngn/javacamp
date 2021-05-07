package Gamer.dataAccess.abstracts;

import Gamer.entities.concretes.Customer;

public interface CustomerDao {
	
	void save (Customer customer);
	
	void update(Customer customer);
	
	void delete(Customer customer);

}
