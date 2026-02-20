import java.util.Scanner;

public class TicTacToe {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int moves = 0;
        boolean gameWon = false;

        while (moves < 9) {

            printBoard();

            System.out.println("Player " + currentPlayer + ", enter slot number:");
            int slot = sc.nextInt();

            if (board[slot - 1] == 'X' || board[slot - 1] == 'O') {
                System.out.println("Slot already taken! Try again.");
                continue;
            }

            board[slot - 1] = currentPlayer;
            moves++;

            if (checkWinner()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            // Switch Player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            printBoard();
            System.out.println("Game is a Draw!");
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println();
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    static boolean checkWinner() {

        // Rows
        if (board[0]==board[1] && board[1]==board[2]) return true;
        if (board[3]==board[4] && board[4]==board[5]) return true;
        if (board[6]==board[7] && board[7]==board[8]) return true;

        // Columns
        if (board[0]==board[3] && board[3]==board[6]) return true;
        if (board[1]==board[4] && board[4]==board[7]) return true;
        if (board[2]==board[5] && board[5]==board[8]) return true;

        // Diagonals
        if (board[0]==board[4] && board[4]==board[8]) return true;
        if (board[2]==board[4] && board[4]==board[6]) return true;

        return false;
    }
}