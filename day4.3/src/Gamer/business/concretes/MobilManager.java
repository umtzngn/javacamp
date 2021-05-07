package Gamer.business.concretes;

import Gamer.business.abstracts.CustomerCheckService;
import Gamer.entities.concretes.Customer;

public class MobilManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	public MobilManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
			System.exit(0);
		}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kiþi güncellenmiþtir : " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kiþi silinmiþtir : " + customer.getFirstName());
		
	}
	
	

}
