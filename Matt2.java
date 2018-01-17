import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Matt2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] board = new String[8][8]; // R C || Y X
		int[] height = { 7, 7, 7, 7, 7, 7, 7, 7 };

		for (int row = 0; row < 8; row++) { // Creates empty
			for (int col = 0; col < 8; col++) { // 8x8 board
				board[col][row] = " ";
			}
		}

		int turn = 0, winner = 0; // 0 = playing, 1 = X win, 2 = O win, 3 = draw
		while (winner == 0) {
			if (height[1] == 0 && height[0] == 0 && height[2] == 0 && height[3] == 0 && height[4] == 0 && height[5] == 0
					&& height[6] == 0 && height[7] == 0) {
				System.out.println("DRAW");
				return;
			}
			displayBoard(board);

			if (turn % 2 == 0)
				System.out.println("X: YOUR TURN");
			else
				System.out.println("O: YOUR TURN");
			System.out.println("Input a number (1-8)");
			int column = Integer.parseInt(br.readLine()) - 1;
			if (turn % 2 == 0) {
				if (height[column] >= 0)
					board[column][height[column]] = "X";
				else {
					turn--;
					System.out.println("OUT OF BOUNDS PLAYER X");
				}
			} else {
				if (height[column] >= 0)
					board[column][height[column]] = "O";
				else {
					turn--;
					System.out.println("OUT OF BOUNDS PLAYER O");
				}
			}
			height[column]--;
			winner = checkWinner(board);
			turn++;
		}
	}

	public static void displayBoard(String[][] board) {
		for (int row = 0; row < board.length; row++) {
			System.out.print("|");
			for (int col = 0; col < board[0].length; col++) {
				System.out.print("" + board[col][row] + "|");
			}
			System.out.println();
		}
	}

	public static int checkWinner(String[][] board) {
		for (int i = 0; i < board[0].length; i++) {

		}
		return 0;
	}

	public boolean placePiece(String[][] board, int location) {
		return false;
	}

	public void printBoard(String[][] board) {

	}

}