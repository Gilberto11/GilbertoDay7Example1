import java.util.Scanner;

public class Wooden extends Floor {
	
	private String woodType;
	private String floorType;
	private double packageArea;
	
	public Wooden(){
		super();
		
	}
	public Wooden(String m, String n, double c, String wt, String ft, double pa ){
		super(m,n,c);
		woodType = wt;
		floorType =  ft;
		packageArea = pa;
		
		
	}
	
	public String getWoodType(){
		return woodType;
		
	}
	
	public void setWoodType(String wt){
		woodType = wt;
	}
	
	public String getFloorType(){
		return floorType;
	}
	
	public void setFloorType(String ft){
		floorType = ft;
		
	}
	
	public double getPackageArea(){
		return packageArea;
	}
	
	public void getPackageArea(double pa){
		packageArea = pa;
	}
	

	@Override
	public String toString(){
		return super.toString() + "\n" +
				"Wood Type= " + woodType + "\n" +
				"Floor Type= " + floorType + "\n" +
				"Package Area= " + packageArea;
		
		
	}
	@Override
	public double calculateCost(double area) {
		
		double boxes = Math.ceil(area/packageArea);
		double cost = (boxes * packageArea) * getCostPerMetreSquared();
		return cost;
	}
	
	public Floor addNewFloor(){
		Scanner inputText = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Please Enter the Manufacturer name: ");
		String manuf = inputText.nextLine();
		System.out.println("Please Enter the Product name: ");
		String n = inputText.nextLine();
		System.out.println("Please Enter the Cost Per Metre Square: ");
		double c = inputNumber.nextDouble();
		System.out.println("Please Enter the Wood Type: ");
		String wt = inputText.nextLine();
		System.out.println("Please Enter the Floor Type: ");
		String ft = inputText.nextLine();
		System.out.println("Please Enter the Package Area: ");
		double pa = inputNumber.nextDouble();
		
		Floor f = new Wooden(manuf, n, c, wt, ft, pa);
		return f;
		
		
		
		
		
	}
	

	}
	


	



