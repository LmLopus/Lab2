import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
	
	
	String cont = "yes";
	while (cont.equalsIgnoreCase("yes")) {
		System.out.println("Please enter the length of the classroom");
			int length = scnr.nextInt();
		System.out.println("Please enter the width of the classroom");
			int width = scnr.nextInt();
		System.out.println("Please enter the height of the classroom");
			int height = scnr.nextInt();	
			
		int perimeter = (length * 2) + (width * 2);
		int area = length * width;
		int volume = height * length * width; 
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
		
		System.out.println("Do you wish to continue? yes or no");
			cont = scnr.next();
		}
	}
}
