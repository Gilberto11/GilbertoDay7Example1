
public abstract class Floor {

	private String manufacturer;
	private String name;
	private double costPerMetreSquared;
	
	
	public Floor(){
		//empty constructor
	}
	
	public Floor(String m, String n, double c){
		manufacturer = m;
		name = n;
		costPerMetreSquared = c;
		
	}
	
	public String getManufacturer(){
		return manufacturer;
		
	}
	public void setManufacturer(String m){
		manufacturer = m;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setName(String n){
		name = n;
		
	}
	
	public double getCostPerMetreSquared(){
		return costPerMetreSquared;
		
	}
	public void setCostPerMetreSquared(double c){
		costPerMetreSquared = c;
	}
	
	@Override
	public String toString(){
		return  "Manufacturer:" + manufacturer + "\n" + "Name: " + name + "\n"
				+ "Cost Per Metre Squared: " + costPerMetreSquared;
	}
	
	public abstract double calculateCost(double area);
	public abstract  Floor addNewFloor();
	
	
	
}
