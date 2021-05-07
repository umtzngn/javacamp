package InterfaceAbstractCoffe.business.concretes;

import InterfaceAbstractCoffe.business.abstracts.CustomerCheckService;
import InterfaceAbstractCoffe.entities.concretes.Customer;


public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckRealPerson(Customer customer) {
		return true;
	}

}
