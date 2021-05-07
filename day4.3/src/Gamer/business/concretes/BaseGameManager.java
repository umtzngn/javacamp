package Gamer.business.concretes;

import Gamer.dataAccess.abstracts.GameDao;
import Gamer.entities.concretes.Game;

public class BaseGameManager implements GameDao {

	@Override
	public void save(Game game) {
		System.out.println("Saved to db : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated to db : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("deleted to db : " + game.getGameName());
		
	}

}
