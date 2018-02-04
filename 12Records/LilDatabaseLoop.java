import java.util.Scanner;

public class LilDatabaseLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Student[] student = new Student[3];
		
		for ( int i = 0; i < student.length; i++ )
		{
			student[i] = new Student();
			
			System.out.print( "Enter student " + (i + 1) + "'s name: " );
			student[i].name = keyboard.next();
			System.out.print( "Enter student " + (i + 1) + "'s grade: " );
			student[i].grade = keyboard.nextInt();
			System.out.print( "Enter student " + (i + 1) + "'s average: ");
			student[i].avg = keyboard.nextDouble();
			System.out.println();
		}
		
		System.out.print( "The names are: " );
		for ( int i = 0; i < 3; i++ )
			System.out.print( student[i].name + " " );
		System.out.println();	
		
		System.out.print( "The grades are: " );
		for ( int i = 0; i < 3; i++ )
			System.out.print( student[i].grade + " " );
		System.out.println();	

		System.out.print( "The averages are: " );
		for ( int i = 0; i < 3; i++ )
			System.out.print( student[i].avg + " " );
		System.out.println();	
	}
}