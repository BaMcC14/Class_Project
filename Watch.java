import java.util.Scanner;

public class Watch {

	public static void main(String[] args) {

		digitalWatch dw = new digitalWatch();  									  //create new object of digitalWatch
		analogWatch aw = new analogWatch();  									  //create new object of analogWatch

		dw.setTime();       													  //call method setTime from the digitalWatch object called dw
		aw.setTime(10, 30); 													  //call method setTime from the analogWatch object called aw the time is hard coded in the method

	} 																			  // end of main method

	static class digitalWatch {                                       	  	 	  //create a new class called digitalWatch
		Scanner scanner = new Scanner(System.in);                    	 		  //create a new scanner object called scanner

		public void setTime() {										 	 		  //create a new method called setTime
			System.out.println("Enter the Hour (1-24)");			 	 		  //ask the user to enter in the hour
			int hour = scanner.nextInt();							 	 		  //create a new variable called hour and the value is set to the next input from the user.
			if (hour >= 1 && hour <= 24) {								  		  //create an if statement to ensure the number entered is between 1 and 24 (military time) 
				System.out.println("Enter the Minutes (0-59 ");		 	 		  //ask the user to enter in the min
				int min = scanner.nextInt();						  		   	  //create a new variable called min and the value is set to the next input from the user. 
				if (min >= 0 && min <= 59) {					     			  //create an if statement to ensure the number entered is between 0 and 59
					System.out.println(hour + ":" + min);			 		  	  //print out the hour and min set by users 
				} else {			   								 			  //create an else statement for the inside if statement 
					System.out.println("Enter a number 0-59 - Try Again");		  //tells the user to enter a number between 0 and 59 and try again
					setTime();											 		  //recall the setTime method if the number was not within the bounds
				}
			} else {											 	 			  //create and else statement for the outside if statement
				System.out.println("Enter a number 1-24 - Try Again");		      //tells the user to enter a number between 1 and 24 and try again
				setTime();														  //recall the setTime method if the number was not within the bounds
			}
		}
	}

	static class analogWatch {													  //create a new class called analogWatch
		Scanner scanner = new Scanner(System.in);								  //create a new scanner object called scanner

		public void setTime(int a, int b) {										  //create a new method called setTime that accepts two arguments 
			System.out.println(a + ":" + b);									  //method prints out the arguments entered
		}
	}
}
