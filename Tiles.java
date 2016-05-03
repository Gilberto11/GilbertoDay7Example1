import java.util.Scanner;

public class Tiles extends Floor{

	private String tileType;
	private String colour;
	private double tileArea;
	private int numOfTilesInBox;
	
	public Tiles(){
		super();
		
	}
	
	public Tiles(String m, String n, double c,  String tt, String col, double ta, int num ){
		super(m,n,c);
		tileType = tt;
		colour =  col;
		tileArea = ta;
		numOfTilesInBox = num;
		
		
		
}
	public String getTileType(){
		return tileType;
	}
	
	public void setTileType(String tt){
		tileType = tt;
		
	}
	
	public String getColour(){
		return colour;
	}
	
	public void setColour(String col){
		colour = col;
	}
	
	public double getTileArea(){
		return tileArea;
	}
	
	public void setGetTileArea(double ta){
		tileArea = ta;
	}
	
	public int getnumOfTilesInBox(){
		return numOfTilesInBox;
	}
	
	public void setNumOfTilesInBox(int num){
		numOfTilesInBox = num;
	}
	@Override
	public String toString(){
		return super.toString() + "\n" +
				"Tile Type= " + tileType + "\n" +
				"Colour= " + colour + "\n" +
				"Number of Tiles in Box= " + numOfTilesInBox;
	}
	
	
	
	
	@Override
	public double calculateCost(double area) {
		double boxArea = numOfTilesInBox * tileArea;
		double boxes = Math.ceil(area/boxArea);
		double tileCost = (boxes * boxArea) * getCostPerMetreSquared();
		double numAdhesive = Math.ceil(area/30);
		double adhesiveCost = numAdhesive * 10.0;
		double numGrout = Math.ceil(area/50);
		double groutCost = numGrout * 12.0;
		double cost = tileCost + adhesiveCost + groutCost;
		return cost;
	}
	@Override
	
	public Floor addNewFloor(){
		Scanner inputText = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Please Enter the Manufacturer name: ");
		String manuf = inputText.nextLine();
		System.out.println("Please Enter the Product name: ");
		String n = inputText.nextLine();
		System.out.println("Please Enter the Cost Per Metre Square: ");
		double c = inputNumber.nextDouble();
		System.out.println("Please Enter the Tile Type: ");
		String tt = inputText.nextLine();
		System.out.println("Please Enter the Tile Colour: ");
		String col = inputText.nextLine();
		System.out.println("Please Enter the Tile Area: ");
		double ta = inputNumber.nextDouble();
		System.out.println("Please enter the Number of Tiles in Box");
		int num = inputNumber.nextInt();
		
		Floor f = new Tiles(manuf, n, c, tt, col, ta, num);
		return f;
		//String m, String n, double c, String tt, String col, double ta, int num
	}
		
		
	}
