package Herencias;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1200);
		Programmer pro1  = new  Programmer(1200,200);
		System.out.println("El salario del programador es: "+pro1.salary+"€");
		System.out.println("El bonus por ser programador es: "+pro1.getBonus()+"€");
		
		//EL ATRIBUTO SALARY ES PUBLIC
		System.out.println("El sueldo de un empleado es: "+emp1.salary+"€");
	}

}
