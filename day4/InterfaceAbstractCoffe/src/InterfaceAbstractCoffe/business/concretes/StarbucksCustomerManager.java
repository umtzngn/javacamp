package InterfaceAbstractCoffe.business.concretes;

import InterfaceAbstractCoffe.business.abstracts.CustomerCheckService;
import InterfaceAbstractCoffe.entities.concretes.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save (Customer customer) {
		if (customerCheckService.CheckRealPerson(customer)) {
			
			super.save(customer);
			
		}else {
			System.out.println("Not a valid person");
		}
	} 
	
}
