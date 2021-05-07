package Gamer.dataAccess.abstracts;

import Gamer.entities.concretes.Campaign;

public interface CampaignDao {
	
	void add (Campaign campaign);
	
	void update (Campaign campaign);
	
	void delete (Campaign campaign);

}
