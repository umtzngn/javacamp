package InterfaceAbstractCoffe.business.concretes;

import InterfaceAbstractCoffe.entities.abstracts.CustomerService;
import InterfaceAbstractCoffe.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public  void  save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}

}
