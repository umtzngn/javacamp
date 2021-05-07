package InterfaceAbstractCoffe.adapters;

import java.rmi.RemoteException;

import InterfaceAbstractCoffe.business.abstracts.CustomerCheckService;
import InterfaceAbstractCoffe.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class mernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
				
				try {
					result = client.TCKimlikNoDogrula(
							Long.parseLong(customer.getnationalityId()), 
							customer.getFirstName().toUpperCase(), 
							customer.getLastName().toUpperCase(), 
							customer.getDateOfBirth());
				} catch (RemoteException e) {
					e.printStackTrace();
				}
				return result;
	}

}
