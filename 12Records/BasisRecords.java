import java.util.Scanner;

class Student
{
	String name;
	int grade;
	double avg;
}

public class BasisRecords
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Student s_1 = new Student(); 
		Student s_2 = new Student();
		Student s_3 = new Student();
		
		System.out.print( "Enter the first student's name: " );
		s_1.name = keyboard.next();
		System.out.print( "Enter the first student's grade: " );
		s_1.grade = keyboard.nextInt();
		System.out.print( "Enter the first student's average: " );
		s_1.avg = keyboard.nextDouble();
		System.out.println();

		System.out.print( "Enter the second student's name: " );
		s_2.name = keyboard.next();
		System.out.print( "Enter the second student's grade: " );
		s_2.grade = keyboard.nextInt();
		System.out.print( "Enter the second student's average: " );
		s_2.avg = keyboard.nextDouble();
		System.out.println();

		System.out.print( "Enter the third student's name: " );
		s_3.name = keyboard.next();
		System.out.print( "Enter the third student's grade: " );
		s_3.grade = keyboard.nextInt();
		System.out.print( "Enter the third student's average: " );
		s_3.avg = keyboard.nextDouble();
		System.out.println();
		
		System.out.println( "The names are: " + s_1.name + " " + s_2.name + " " + s_3.name );
		System.out.println( "The grades are: " + s_1.grade + " " + s_2.grade + " " + s_3.grade );
		System.out.println( "The averages are: " + s_1.avg + " " + s_2.avg + " " + s_3.avg );
		
		System.out.println( "\nThe average for the three students is: " + ((s_1.avg + s_2.avg + s_3.avg) / 3) );
	}
}