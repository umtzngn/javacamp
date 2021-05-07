package InterfaceAbstractCoffe.business.abstracts;

import InterfaceAbstractCoffe.entities.concretes.Customer;

public interface CustomerCheckService {
	
	boolean CheckRealPerson(Customer customer);

}
