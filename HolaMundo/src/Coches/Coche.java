package Coches;

public class Coche {
	private String fuel;
	private int maxSpeed;
	
	//GETTERS Y SETTERS
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	//CONSTRUCTOR
	public Coche(String fuel, int maxSpeed) {

		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}
	public Coche() {

	}
	
	//CONSTRUCTOR VACIO
	
	
}
