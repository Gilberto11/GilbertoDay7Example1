import java.util.Scanner;

public class Example1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputText = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		FloorList myFloors = new FloorList();
		
		int answer;
		String keepgoing;
		
		do {
			System.out.println("Please choose an option from the menu: ");
			System.out.println("1. display all floors");
			System.out.println("2. add a floor");
			System.out.println("3. get floor cost");
			
			answer = inputNumber.nextInt();
			switch(answer){
			case 1:
				myFloors.display();
				break;
			case 2:
				myFloors.addFloor();
				break;
			case 3:
				myFloors.getCost();
				break;
				
				default:
					System.out.println("That is not a valid option");
			}
			
			
		System.out.println("Would you like to see the menu again? y or n");
		keepgoing = inputText.nextLine();
		
	
		}while (keepgoing.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
		
		
	}
	
}
		
		
		
		
	

	



	

	


