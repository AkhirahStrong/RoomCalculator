import java.util.Scanner;

public class RoomCalculatorApp {

public static void main(String[] args) {
		
		double length;
		double width; 
		double height;
		double area; 
		double perimeter;
		double volume;
		String answer = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			//Prompt the user to enter values of length width and height of the classroom.
	      
	        System.out.println("Enter Length:");
	        length = scan.nextDouble();
	        
	        System.out.println("Enter Width:");
	        width = scan.nextDouble();
	        
	        System.out.println("Enter Height: ");
	        height = scan.nextDouble();
	        
	        // Area of rectangle = length X width
	        area = length * width;
	        
	        // Parameter of rectangle = 2 X (length X width)
	        perimeter = 2 * (length + width);
	        
	        //Volume for room = length x width x height
	        volume = length * width * height;
	        
	        //Display the area and parameter of that classroom.
	        System.out.println("Area of room : "+ area);
	        System.out.println("Rectangle of room : "+ perimeter);
	        System.out.println("Volume of room: " + volume);
	        
	        
	        //Ask if user wants to continue.
	        System.out.println("Continue(Y/N)");
	         answer = scan.next();
			
		}while(answer.equalsIgnoreCase("Y") );
		
		
		scan.close();
	}

}
