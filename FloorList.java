import java.util.ArrayList;
import java.util.Scanner;

public class FloorList {
	//private data member
	private ArrayList<Floor> floors = new ArrayList<Floor>();
	
	//empty constructor
	public FloorList(){
		floors.add(new Wooden("TimberWorld", "Country Look", 10.5, "Oak", "Semi - solid", 10.0));
		

		floors.add(new Tiles("Maken", "Ocean Feel", 15.5, "Oak ","Blue and White", 0.25, 10));
		
		//String m, String n, double c, String wt, String tt, String col, double ta, int num 
		
		
		
	}
	
	public FloorList(ArrayList<Floor> f){
		floors = f;
		
	}
	public ArrayList<Floor> getFloors(){
		return floors;
	}
	
	//setter
	public void setFloors(ArrayList<Floor> f){
		floors = f;
		
	}
	//add a floor
	public void addFloor(){
		
		// reference to a floor object so this can point to either a wooden or tile floor object = floor f;
		// it can never point directly to the floor coz floor is an abstract class
		// we can not create an instance of an abstract class
		// i.e. we cannot say f = new floor()
		Floor f;
		Scanner input = new Scanner(System.in);
		System.out.println("What Kind of floor you want to add: ");
		System.out.println("1. Wooden");
		System.out.println("2. Tiles:");
		int answer = input.nextInt();
		switch (answer){
			case 1: 
				f = new Wooden();
				floors.add(f.addNewFloor());
				break;
			case 2:
				f = new Tiles();
				floors.add(f.addNewFloor());
				break;
				default:
					System.out.println("That is not a valid option");
		}
					
				
				
		}
		public void display(){
			//looping through an array list
			//watch out for the size() method instead of length property
			for (int i=0; i<floors.size(); i++){
				//instead of using [i] we use the method
				// floor.get(i) to acess the element of the arraylist
				System.out.println(floors.get(i));
				System.out.println("----------------------------------------------------------");
			
			}
		}
		public void getCost(){
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the floor area: ");
			double area = input.nextDouble();
			for (int i=0; i<floors.size(); i++){
				System.out.println(floors.get(i));
				System.out.printf("Floor cost: %.2f\n", floors.get(i).calculateCost(area));
				System.out.println("--------------------------------------------------------------");
				
			}
		}
	
		
	}



