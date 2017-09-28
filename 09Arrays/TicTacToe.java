import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		char player1 = 'X', player2 = 'O';
		int turn = 1;
		boolean t = true;

		initBoard();
		displayBoard();

		while ( t )
		{
			System.out.println( "Turn " + turn + "..." );
			if ( turn % 2 != 0 )
			{
				choice(player1);
				turn++;
			}
			else 
			{
				choice(player2);
				turn++;
			}
			displayBoard();
			if ( win(player1) )
			{
				System.out.println( "'" + player1 + "' wins the game!" );
				t = false;
			}
			else if ( win(player2) )
			{
				System.out.println( "'" + player2 + "' wins the game!" );
				t = false;
			}
			else if ( turn > 9 )
			{
				System.out.println( "This game is a tie." );
				t = false;
			}
			
		}
			
	}

	public static void initBoard()
	{
		for ( int r=0; r<3; r++ ){
			for ( int c=0; c<3; c++ ){
				board[r][c] = ' ';
			}
		}
	}


	public static void displayBoard()
	{
		System.out.println();
		System.out.println("  0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("    ---+---+---");
		System.out.println("  1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("    ---+---+---");
		System.out.println("  2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		System.out.println("     0   1   2\n");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
	
	public static void choice( char player )
	{
		Scanner kb = new Scanner(System.in);
		int row, column;
		
		System.out.print( "'" + player + "', choose your location (row, column): " );
		row = kb.nextInt();
		column = kb.nextInt();
		while((row > 3 || column > 3) || (row < 0 || column < 0) || (board[row][column] == 'O' || board[row][column] == 'X')){
			System.out.print( "'" + player + "', you can't choose this place. Try again:" );
			row = kb.nextInt();
			column = kb.nextInt();
		}
		
		board[row][column] = player;
	}
	
	public static boolean win( char player )
	{
		for ( int r = 0; r < 3; r++ )
		{
			if ( player == board[r][0] && board[r][0] == board[r][1] && board[r][1] == board[r][2] ){
				return true;
			}
		}
		for ( int c = 0; c < 3; c++ )	
		{
			if ( player == board[0][c] && board[0][c] == board[1][c] && board[1][c] == board[2][c] ){
				return true;
			}
		}
		if ( player == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2] ){
				return true;
		}
		else if ( player == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0] ){
				return true;
		}
		
		
		return false;
	}
}