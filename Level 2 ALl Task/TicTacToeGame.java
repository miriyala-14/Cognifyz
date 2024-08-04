import java.util.Scanner;

class TicTacToeGame {

    public static void main(String[] args) {
        char[][] gameBoard = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                gameBoard[row][col] = '-';
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Tic Tac Toe!");
        System.out.print("Player 1, what is your name? : ");
        String playerOneName = scanner.nextLine();
        System.out.print("Player 2, what is your name? : ");
        String playerTwoName = scanner.nextLine();

        boolean isPlayerOneTurn = true;
        boolean hasGameEnded = false;

        while (!hasGameEnded) {
            displayBoard(gameBoard);

            if (isPlayerOneTurn) {
                System.out.println(playerOneName + "'s Turn (x):");
            } else {
                System.out.println(playerTwoName + "'s Turn (o):");
            }

            char currentPlayerMark = isPlayerOneTurn ? 'x' : 'o';

            int selectedRow;
            int selectedCol;

            while (true) {
                System.out.print("Enter a row number (0, 1, or 2): ");
                selectedRow = scanner.nextInt();
                System.out.print("Enter a column number (0, 1, or 2): ");
                selectedCol = scanner.nextInt();

                if (selectedRow < 0 || selectedCol < 0 || selectedRow > 2 || selectedCol > 2) {
                    System.out.println("This position is out of bounds! Try again.");
                } else if (gameBoard[selectedRow][selectedCol] != '-') {
                    System.out.println("This position is already taken! Try again.");
                } else {
                    break;
                }
            }

            gameBoard[selectedRow][selectedCol] = currentPlayerMark;

            if (checkWin(gameBoard) == 'x') {
                System.out.println(playerOneName + " has won!");
                hasGameEnded = true;
            } else if (checkWin(gameBoard) == 'o') {
                System.out.println(playerTwoName + " has won!");
                hasGameEnded = true;
            } else if (isBoardFull(gameBoard)) {
                System.out.println("It's a tie!");
                hasGameEnded = true;
            } else {
                isPlayerOneTurn = !isPlayerOneTurn;
            }
        }

        displayBoard(gameBoard);
    }

    public static void displayBoard(char[][] board) {
        System.out.println("Board:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    public static char checkWin(char[][] board) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != '-') {
                return board[row][0];
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != '-') {
                return board[0][col];
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }

        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

        return ' ';
    }

    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
