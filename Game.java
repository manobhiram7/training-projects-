import java.util.Scanner;

public class Game {

    public static void printBoard(char[][] board) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if(j < 2) System.out.print(" | ");
            }
            System.out.println();
            if(i < 2) System.out.println("--+---+--");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char player = 'X';

        for(int turn = 0; turn < 9; turn++) {

            printBoard(board);

            System.out.println("Player " + player + " turn:");
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            if(board[row][col] == ' ') {
                board[row][col] = player;

                if(player == 'X')
                    player = 'O';
                else
                    player = 'X';
            } 
            else {
                System.out.println("Cell already taken. Try again.");
                turn--;
            }
        }

        printBoard(board);
        System.out.println("Game Over");
        sc.close();
    }
}