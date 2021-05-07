package InterfaceAbstractCoffe;

import InterfaceAbstractCoffe.adapters.mernisServiceAdapter;
import InterfaceAbstractCoffe.business.concretes.BaseCustomerManager;
import InterfaceAbstractCoffe.business.concretes.StarbucksCustomerManager;
import InterfaceAbstractCoffe.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "UMUT", "ZENGÝN", 1994, "111111111111");
		
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new mernisServiceAdapter());
		baseCustomerManager.save(customer);
		
	}

}
