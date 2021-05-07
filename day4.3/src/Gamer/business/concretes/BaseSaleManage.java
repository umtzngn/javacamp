package Gamer.business.concretes;

import Gamer.dataAccess.abstracts.SaleDao;
import Gamer.entities.concretes.Campaign;
import Gamer.entities.concretes.Customer;
import Gamer.entities.concretes.Game;

public class BaseSaleManage implements SaleDao {
	
	@Override
	public void saleGame(Game game, Customer customer,Campaign campaign) {
		System.out.println(customer.getFirstName() + " isimli kullanýcý " + game.getGameName() + " oyununu "+ game.getUnitPrice() + "birim fiyatlý oyunu"+ campaign.getCampaignName() + "kampanyasý ile satýn alýnmýþtýr."  );
		
	}

}
