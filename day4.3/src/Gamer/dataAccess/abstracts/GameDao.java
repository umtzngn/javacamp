package Gamer.dataAccess.abstracts;

import Gamer.entities.concretes.Game;

public interface GameDao {
	
	void save (Game game);
	
	void update (Game game);
	
	void delete (Game game);
	

}
