import java.util.Scanner;

public class Board {
	private int[][] board;

	public Board() {
		board = new int[6][7];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = 0;
			}
		}
	}

	public int[][] getBoard() {
		return board;
	}

	public boolean changeBox(int a, int b) {
		for (int i = board.length - 1; i >= 0; i--) {
			if (board[i][b] == 0) {
				board[i][b] = a;
				return true;
			}
		}
		return false;
	}

	public boolean horizontal() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length - 3; j++) {
				int temp = board[i][j];
				if ((temp == board[i][j + 1] && temp == board[i][j + 2] && temp == board[i][j + 3]) && temp != 0) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean vertical() {
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int temp = board[i][j];
				if ((temp == board[i + 1][j] && temp == board[i + 2][j] && temp == board[i + 3][j]) && temp != 0) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean diagonalUp() {
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 0; j < board[i].length - 3; j++) {
				int temp = board[i][j];
				if ((temp == board[i + 1][j + 1] && temp == board[i + 2][j + 2] && temp == board[i + 3][j + 3])
						&& temp != 0) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean diagonalDown() {
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 3; j < board[i].length; j++) {
				int temp = board[i][j];
				if ((temp == board[i + 1][j - 1] && temp == board[i + 2][j - 2] && temp == board[i + 3][j - 3])
						&& temp != 0) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean winCondition() {
		return horizontal() || vertical() || diagonalUp() || diagonalDown();
	}

	// Runs Code Here
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Board a = new Board();
		int turnLeft = 42;
		int input;
		printScreen(a.getBoard());

		for (int i = 0; turnLeft-- > 0; i = 1 - i) {
			int number = i + 1;
			System.out.print("Drop a " + (number == 1 ? "red" : "yellow") + " disk at column (0-6):");
			input = stdin.nextInt();
			while (input > 6 || input < 0 || a.changeBox(number, input) == false) {
				System.out.println("Invalid Input, enter a new number");
				input = stdin.nextInt();
			}
			printScreen(a.getBoard());
			if (a.winCondition()) {
				System.out.println("The " + (number == 1 ? "red" : "yellow") + " player won.");
				return;
			}
		}
		System.out.println("No one wins");
	}

	// Print String[][]
	public static void printScreen(int[][] board) {
		String[][] a = format(board);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	// Convert int[][] to String[][]
	public static String[][] format(int[][] board) {
		String[][] nBoard = new String[board.length + 1][board[0].length + 1];
		for (int i = 0; i < nBoard.length; i++) {
			for (int j = 0; j < nBoard[0].length; j++) {
				if (i < nBoard.length - 1 && j < nBoard[0].length - 1) {
					switch (board[i][j]) {
					case 0:
						nBoard[i][j] = "| ";
						break;
					case 1:
						nBoard[i][j] = "|R";
						break;
					default:
						nBoard[i][j] = "|Y";
					}
				} else {
					nBoard[i][j] = (i == nBoard.length - 1) ? (j == nBoard[0].length - 1) ? "." : ".." : "|";
				}
			}
		}
		return nBoard;
	}

}
