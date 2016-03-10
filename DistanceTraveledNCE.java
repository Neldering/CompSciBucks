import java.util.Scanner;

public class DistanceTraveledNCE {
	public static void main( String[] args ){
		int mph, hours, distance = 0, count = 1;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This program will take a positive integer");
		
		System.out.print("Enter the hours traveled: > ");
		hours = kb.nextInt();
		System.out.println();
		
		System.out.print("Enter the miles per hour: > ");
		mph = kb.nextInt();
		System.out.println();
		
		System.out.println("Hours---------------Distance");
		while ( count <= hours ) {
			distance = count * mph;
			System.out.println( count + "                   " + distance);
			count++;
		}
	}
}
