import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        boolean playAgain = true;

        while (playAgain) {
            initializeBoard(board);
            boolean gameEnded = false;

            while (!gameEnded) {
                printBoard(board);
                playerMove(board, currentPlayer, scanner);
                gameEnded = isGameEnded(board, currentPlayer);

                if (gameEnded) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                } else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("The game is a draw!");
                    gameEnded = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void playerMove(char[][] board, char currentPlayer, Scanner scanner) {
        int row = 0;
        int col = 0;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            if (row >= 0 && col >= 0 && row < 3 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid");
            }
        }
    }

    public static boolean isGameEnded(char[][] board, char currentPlayer) 
    {
        return (checkRows(board, currentPlayer) || checkColumns(board, currentPlayer) || checkDiagonals(board, currentPlayer));
    }

    public static boolean checkRows(char[][] board, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] board, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(char[][] board, char currentPlayer) {
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
