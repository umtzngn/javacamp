package Gamer.business.concretes;

import Gamer.business.abstracts.CustomerCheckService;
import Gamer.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckRealPerson(Customer customer) {
		return true;
		
		
		
		
	}

}
