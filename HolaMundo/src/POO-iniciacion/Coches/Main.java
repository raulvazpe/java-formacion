package Coches;

public class Main {

	public static void main(String[] args) {
		//INSTANCIAMOS UN NUEVO OBJETO TIPO COCHE
		Coche coche1 = new Coche();
		//LLAMAMOS A LOS SETTERS
		
		coche1.setFuel("DIESEL");
		coche1.setMaxSpeed(200);
		
		//LLAMAMOS A LOS GETTERS
		System.out.println(coche1.getFuel());
		System.out.println(coche1.getMaxSpeed()+"KM/h");

	}
 
}
