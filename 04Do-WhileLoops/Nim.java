import java.util.Scanner;

public class Nim
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int a = 3;
		int b = 4;
		int c = 5;
		int value = 0;
		int number = 0;
		int all = a+b+c;
		int[] arr = new int[3];

		String choice = "", player1, player2, player = "";

		//System.out.println("Player 1, enter your name: ");
		//player1 = keyboard.nextLine();
        //System.out.println("Player 2, enter your name: ");
		//player2 = keyboard.nextLine();

		player1 = "computer";
		player2 = "Gordey";
		
		while (all > 1)
		{	
				all = a+b+c;
				number = number + 1;
				if(number % 2 == 0){
					player = player2;
				}
				else if(number % 2 != 0) {
					player = player1;
				}
				//System.out.println("    *");
				for(int i = 5; i > 0; i = i - 1){
					if(a >= i){
					System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
					if(b >= i){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
					if(c >= i){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
					System.out.print( "\n" );
				}
				/*if(a >= 4){
					System.out.print("*");
				}
				if(b >= 4){
					System.out.print(" *");
				}
				if(c >= 4){
					System.out.print(" *");
				}
				System.out.print( "\n" );
				if(a >= 3){
					System.out.print("*");
				}
				if(b >= 3){
					System.out.print(" *");
				}
				if(c >= 3){
					System.out.print(" *");
				}
				System.out.print( "\n" );
				if(a >= 2){
					System.out.print("*");
				}
				if(b >= 2){
					System.out.print(" *");
				}
				if(c >= 2){
					System.out.print(" *");
				}*/
				System.out.print( "\n" );
				System.out.println( "A B C" );
				System.out.print( "\n" );
				
				if(player.equals("computer")){
					
					//sorting the array of piles
					arr[0] = a;
					arr[1] = b;
					arr[2] = c;
					int f = 0;
					
					for(int i = 0; i < 2; i++ ) {
						for(int j = 0; j < 2; j++) {
							if(arr[j]>arr[j+1]){
								f = arr[j+1];  
                                arr[j+1] = arr[j];  
                                arr[j] = f;
							}
						}

					}
					
					//System.out.print( arr[0] + " > " +  arr[1] + " > " + arr[2] + "\n" ); 

					if(number == 1) { //first move
						choice = "A";
						value = 2;
					}

					if(arr[0] > 0){ //три колонки
						if(arr[0] == 1 && arr[1] == 1){ //две единицы
							if(a > 1) {
								choice = "A";
								value = a - 1;
							}
							else if(b > 1) {
								choice = "B";
								value = b - 1;
							}
							else if(c > 1) {
								choice = "C";
								value = c - 1;
							}
						}
						else if(arr[1] == arr[2]) { //если две одинаковые, но не 1
							if(a == 1){
								choice = "A";
								value = a;
							}
							else if(b == 1){
								choice = "B";
								value = b;
							}
							else if(c == 1){
								choice = "C";
								value = c;
							}
						}
						else if(arr[1] > 1 && arr[2] > 1) {
							if(arr[1] == 2) { //третий элемент приводим к 3
								if (arr[2] == b) {
									choice = "B";
									value = b-3;
								}
								else if (arr[2] == c) {
									choice = "C";
									value = c-3;
								}
							}
							else if(arr[1] == 3) { //третий элемент приводим к 3
								if (arr[2] == b) {
									choice = "B";
									value = b-2;
								}
								else if (arr[2] == c) {
									choice = "C";
									value = c-2;
								}
							}
						}
						else {
							System.out.print("I don't know what to do! 001");
						}
					}
					else if((c > 0 && b > 0) || (a > 0 && b > 0) || (a > 0 && c > 0)){// две колонки
						if(a == 1 || b == 1 || c == 1){ //проверить, что одна из них 1
							if(a == 1) {
								if(b > 1){
									choice = "B";
									value = b;
								}
								else if(c > 1){
									choice = "C";
									value = c;
								}
							}
							else if(b == 1){
								if(a > 1){
									choice = "A";
									value = a;
								}
								else if(c > 1){
									choice = "C";
									value = c;
								}
							}
							else if(c == 1){
								if(a > 1){
									choice = "A";
									value = a;
								}
								if(b > 1){
									choice = "B";
									value = b;
								}
							}
						}	
						else if((c > 0 && b > 0 && a == 0) || (a > 0 && b > 0 && c == 0) || (a > 0 && c > 0 && b == 0)){
							if(c > 0 && b > 0){
								if(b > c){
									choice = "B";
									value = b-c;
								}
								else if(c > b){
									choice = "C";
									value = c-b;
								}
							}
							else if(a > 0 && b > 0){
								if(b > a){
									choice = "B";
									value = b-a;
								}
								else if(a > b){
									choice = "A";
									value = a-b;
								}
							}
							else if(a > 0 && c > 0){
								if(c > a){
									choice = "C";
									value = c-a;
								}
								else if(a > c){
									choice = "A";
									value = a-c;
								}
							}
						}
					}
					else if ((c == 0 && b == 0 && a > 0) || (a == 0 && b == 0 && c > 0) || (a == 0 && c == 0 && b > 0)) {// одностопочное
							if(c == 0 && b == 0 && a > 0){
								choice = "A";
								value = a-1;
							}
							else if(a == 0 && b == 0 && c > 0){
								choice = "C";
								value = c-1;
							}
							else if(a == 0 && c == 0 && b > 0){
								choice = "B";
								value = b-1;
							}
						}
				}

				else {
					System.out.print(player + ", Choose a pile: ");
					choice = keyboard.nextLine();
					while((choice.equals("A") && a <= 0) || (choice.equals("B") && b <= 0) || (choice.equals("C") && c <= 0 )){
						System.out.print("Nice try, " + player + ". That pile is empty. Choose again: ");
						choice = keyboard.nextLine();
					}
					System.out.print("How many to remove from pile " + choice + ":");
					value = keyboard.nextInt();
					keyboard.nextLine();
					while(value < 1){
						System.out.print("You must choose at least 1. How many? ");
						value = keyboard.nextInt();
						keyboard.nextLine();
					}
					while((choice.equals("A") && value > a) || (choice.equals("B") && value > b) || (choice.equals("C") && value > c )){
						System.out.print("Pile " + choice + " doesn't have that many. Try again: ");
						value = keyboard.nextInt();
						keyboard.nextLine();
					}
				}

				System.out.println(player + " removed " + value + " from pile " + choice);

				if(choice.equals("A")){
					a=a-value;
				}
				else if(choice.equals("B")){
					b=b-value;
				}
				else if(choice.equals("C")){
					c=c-value;
				}
				all = a+b+c;

		}
		all = a+b+c;
		if(all == 1 && number % 2 == 0){
			System.out.println(player1 + ", you must take the last remaining counter, so you lose. " + player2 + " wins!");
		}
		if(all == 1 && number % 2 != 0){
			System.out.println(player2 + ", you must take the last remaining counter, so you lose. " + player1 + " wins!");
		}
		if (all == 0 && number % 2 != 0) {
			System.out.println("\n" + player2 + ", there are no counters left, so you WIN!" );
		}
		else if (all == 0 && number % 2 == 0) {
			System.out.println("\n" + player1 + ", there are no counters left, so you WIN!" );
		}
		System.out.print( "\n" );
	}
	
}