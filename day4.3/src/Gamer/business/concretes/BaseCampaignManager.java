package Gamer.business.concretes;

import Gamer.dataAccess.abstracts.CampaignDao;
import Gamer.entities.concretes.Campaign;

public class BaseCampaignManager implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Saved to db : " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated to db : " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted to db : " + campaign.getCampaignName());
		
	}

}
