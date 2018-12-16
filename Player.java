//*******************************************************************
// Tic-Tac-Toe
// @author Ryan Estevez
// @version 1.0
// @since 12/15/2018
//*******************************************************************

public class Player {
	private String playerName = "";
	private char playerXorO;
	private int winCount;
	private int lossCount;
	private int tieCount;
	
	//Default Constructor for testing
	public Player() {
		this.playerName = "Player1";
		this.playerXorO = 'X';
		this.winCount = 0;
		this.lossCount = 0;
		this.tieCount = 0;
	}
	
	//Constructor
	public Player(String playerName, char playerXorO) {
		this.playerName = playerName;
		this.playerXorO = playerXorO;
		this.winCount = 0;
		this.lossCount = 0;
		this.tieCount = 0;		
	}
	
	public void showPlayerInfo() {
		System.out.println("Name: " + playerName);
		System.out.println("X or O: " + playerXorO);
		System.out.println("Wins:" + winCount);
		System.out.println("Losses: " + lossCount);
		System.out.println("Draws: " + tieCount);
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public char getPlayerXorO() {
		return this.playerXorO;
	}
}
