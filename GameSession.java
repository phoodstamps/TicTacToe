//*******************************************************************
// Tic-Tac-Toe
// @author Ryan Estevez
// @version 1.0
// @since 12/15/2018
//*******************************************************************
import java.util.Scanner;
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
	
	// User input objects and variables
	Scanner scan = new Scanner(System.in);
	String s;
	
	// Sets players up for game and creates game baord to play on
	public GameSession(Player playerOne, Player playerTwo) {
		this.player1 = playerOne;
		this.player2 = playerTwo;
	}
	
	
	// Default constructor that creates local players before starting the game
	public GameSession() {
		createLocalPlayers();
	}
	
	public void startSession() {
		// must check if both players are set and ready before starting the game
		if (!this.checkPlayers()) {
			System.out.println("Players are not ready!");
			System.exit(1);
		}
		System.out.println("\nPlayers are ready! :)");
		player1.showPlayerInfo();
		player2.showPlayerInfo();
		
		//TODO: Display board at the start of each turn
		
		//TODO: Add user input for players to start adding X or O to the board.
		
		//TODO: After each input, check for a winner.
		checkForWinner();
		
		//TODO: If a winner is found, end the game and ask if want to start a new game or quit.
	}
	
	/**
	 * Game won't start until both players are created and ready
	 */
	private boolean checkPlayers(){
		boolean playersReady = false;
		if (player1.getPlayerName() != "" && player2.getPlayerName() != "") {
			playersReady = true;
		}
		return playersReady;
	}
	
	private void createLocalPlayers() {
		// Create Player 1
		System.out.println("Player 1: ");
		s = scan.next();
		player1 = new Player(s,1);
		
		// Create Player 2
		System.out.println("Player 2: ");
		s = scan.next();
		player2 = new Player(s,0);
	}
	
	/**
	 * logic for checking if a player has won the game. Based on the 8 possible winning combos. The 2D array represents the gameboard based on a X and Y grid
	 * @return winner
	 */
	private boolean checkForWinner() {
		boolean winner = false;
		for (int i=1; i<=2; i++)
		if (gameBoard[0][0] == i && gameBoard[0][1] == i && gameBoard[0][2] == i || gameBoard[0][0] == i && gameBoard[1][0] == i && gameBoard[2][0] == i ||
			gameBoard[0][0] == i && gameBoard[1][1] == i && gameBoard[2][2] == i || gameBoard[1][0] == i && gameBoard[1][1] == i && gameBoard[1][2] == i ||
			gameBoard[2][0] == i && gameBoard[1][1] == i && gameBoard[0][2] == i || gameBoard[2][0] == i && gameBoard[2][1] == i && gameBoard[2][2] == i ||
			gameBoard[0][1] == i && gameBoard[1][1] == i && gameBoard[2][1] == i || gameBoard[0][2] == i && gameBoard[1][2] == i && gameBoard[2][2] == i) {
			winner = true;
		}
		return winner;
	}
}
