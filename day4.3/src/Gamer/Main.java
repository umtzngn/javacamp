package Gamer;

import Gamer.adapters.concretes.mernisServiceAdapter;
import Gamer.business.concretes.BaseCustomerManager;
import Gamer.business.concretes.BaseSaleManage;
import Gamer.business.concretes.MobilManager;
import Gamer.business.concretes.MobilSaleManager;
import Gamer.entities.concretes.Campaign;
import Gamer.entities.concretes.Customer;
import Gamer.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		
		
		//System.exit(0) komutu ile kiþiyi doðruluyamaz ise programý sonlandýrýyor.
		
		Customer customer = new Customer(1, "umut", "zengin", 1994, "111111111111");
		
		
		BaseCustomerManager baseCustomerManager = new MobilManager(new mernisServiceAdapter());
		baseCustomerManager.save(customer);
		
		Campaign campaign = new Campaign(0, "Yaz Sezonu", 0.5 );
		
		Game game = new Game(1, "tetris", "görsel", 10);
		
		BaseSaleManage baseSaleManage = new MobilSaleManager();
		baseSaleManage.saleGame(game, customer,campaign);
		
		
	

	}

}
