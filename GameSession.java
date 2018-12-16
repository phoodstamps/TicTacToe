//*******************************************************************
// Tic-Tac-Toe
// @author Ryan Estevez
// @version 1.0
// @since 12/15/2018
//*******************************************************************
public class GameSession {
	private Player player1;
	private Player player2;
	
	/**
	 * gameboard is 3x3
	 * 0 = blank
	 * 1 = player1
	 * 2 = player2
	 */
	private int[][] gameBoard = new int[3][3];
	
	// Sets players up for game and creates game baord to play on
	public GameSession(Player playerOne, Player playerTwo) {
		this.player1 = playerOne;
		this.player2 = playerTwo;
	}
	
	/**
	 * Game won't start until both players are created and set
	 */
	private boolean checkPlayers(){
		boolean playersReady = false;
		if (player1.getPlayerName() != "" && player2.getPlayerName() != "") {
			playersReady = true;
		}
		return playersReady;
	}
	
	public void startGame() {
		if (!this.checkPlayers()) {
			System.out.println("Players are not ready!");
			System.exit(1);
		}
	}
}
