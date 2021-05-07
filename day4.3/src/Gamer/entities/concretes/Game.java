package Gamer.entities.concretes;

import Gamer.entities.abstracts.Entity;

public class Game implements Entity {
	private int id;	
	private String gameName;	
	private String gameType;
	private int unitPrice;
	
	public Game(int id, String gameName, String gameType, int unitPrice) {
		
		this.id = id;
		this.gameName = gameName;
		this.gameType = gameType;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
