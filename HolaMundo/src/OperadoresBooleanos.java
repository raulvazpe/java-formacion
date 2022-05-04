
public class OperadoresBooleanos {

	public static void main(String[] args) {
		/*
		 * int num =3;
		 * 
		 * if(num %2 == 0) { System.out.println("par"); }else {
		 * System.out.println("impar"); }
		 */

		float random = (float) Math.random();
		int aleatorio = Math.round(random);

		if (aleatorio == 0) {
			System.out.println("blanco");
		} else {
			System.out.println("negro");
		}

	}

}
