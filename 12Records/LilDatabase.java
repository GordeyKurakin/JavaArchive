import java.util.Scanner;

class Student
{
	String name;
 	int grade;
 	double avg;
}

public class LilDatabase
{
	public static void main( String[] args )
	{
		Student[] student = new Student[3];
		Scanner keyboard = new Scanner(System.in);
		
		student[0] = new Student();
		System.out.print( "Enter student 1's name: " );
		student[0].name = keyboard.next();
		System.out.print( "Enter student 1's grade: " );
		student[0].grade = keyboard.nextInt();
		System.out.print( "Enter student 1's avg: " );
		student[0].avg = keyboard.nextDouble();
		System.out.println();
		
		student[1] = new Student();
		System.out.print( "Enter student 2's name: " );
		student[1].name = keyboard.next();
		System.out.print( "Enter student 2's grade: " );
		student[1].grade = keyboard.nextInt();
		System.out.print( "Enter student 2's avg: " );
		student[1].avg = keyboard.nextDouble();
		System.out.println();

		student[2] = new Student();		
		System.out.print( "Enter student 3's name: " );
		student[2].name = keyboard.next();
		System.out.print( "Enter student 3's grade: " );
		student[2].grade = keyboard.nextInt();
		System.out.print( "Enter student 3's avg: " );
		student[2].avg = keyboard.nextDouble();
		System.out.println();
		
		System.out.println( "The names are: " + student[0].name + " " + student[1].name + " " + student[2].name );
		System.out.println( "The grades are: " + student[0].grade + " " + student[1].grade + " " + student[2].grade );
		System.out.println( "The averages are: " + student[0].avg + " " + student[1].avg + " " + student[2].avg );
		
	}
}