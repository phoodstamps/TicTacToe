//*******************************************************************
// Tic-Tac-Toe
// @author Ryan Estevez
// @version 1.0
// @since 12/15/2018
//*******************************************************************

public class Player {
	private String playerName = "";
	private int playerXorO; // 1 = X, 0 = O
	private int winCount;
	private int lossCount;
	private int tieCount;
	
	//Default Constructor for testing
	public Player() {
		this.playerName = "TestPlayer";
		this.playerXorO = 1;
		this.winCount = 0;
		this.lossCount = 0;
		this.tieCount = 0;
	}
	
	//Constructor
	public Player(String playerName, int playerXorO) {
		this.playerName = playerName;
		this.playerXorO = playerXorO;
		this.winCount = 0;
		this.lossCount = 0;
		this.tieCount = 0;		
	}
	
	public void showPlayerInfo() {
		System.out.println("Name: " + playerName);
		System.out.println("X or O: " + checkPlayerXorO());
		System.out.println("Wins: " + winCount);
		System.out.println("Losses: " + lossCount);
		System.out.println("Draws: " + tieCount + "\n");
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public int getPlayerXorO() {
		return this.playerXorO;
	}
	
	public void setPlayerName(String setPlayerName) {
		this.playerName = setPlayerName;
	}
	
	// NOTE: Must be set to 1 for X and 0 for O
	public void setPlayerXorO(int XorO) {
		this.playerXorO = XorO;
	}
	
	public char checkPlayerXorO() {
		char XorO;
		if (this.playerXorO == 1) {
			XorO = 'X';
		}
		else {
			XorO = 'O';
		}
		return XorO;
	}
	
}
