package Gamer.dataAccess.abstracts;

import Gamer.entities.concretes.Campaign;
import Gamer.entities.concretes.Customer;
import Gamer.entities.concretes.Game;

public interface SaleDao {
	
	void saleGame (Game game,Customer customer,Campaign campaign);

}
