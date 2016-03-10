import java.util.Scanner;

public class SumOfNumbersNCE {
	public static void main( String[] args ){
	int entryInt, printedInt = 0, count = 1;
	Scanner kb = new Scanner(System.in);
	
	System.out.println("This program will take a positive integer");
	System.out.println("and add the sum of all integers 1 to your entry");
	
	System.out.print("Please enter your integer. > ");
	entryInt = kb.nextInt();
	
	if ( entryInt <= 0 ) {
		System.out.println("Invalid Entry");
		System.exit(0);
	}
	else {
		while ( count <= entryInt ) {
		printedInt += count;
		count++;
		}
	}
	
	System.out.print("Your result is: " + printedInt + "\n");
    
	}
}
