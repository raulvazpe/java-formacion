
public class Condicionales {

	public static void main(String[] args) {

		System.out.println("---------------- ROJO O NEGRO ---------------------");

		float numRandom = (float) Math.random();
		int random = Math.round(numRandom);
		System.out.println(random);

		/*
		 * if(random==0) { System.out.println("negro"); }if(random==1) {
		 * System.out.println("rojo"); }
		 */

		/*
		 * if (random == 0) { System.out.println("negro"); } else {
		 * System.out.println("rojo"); }
		 */
		
		

		/*
		 * OPERADOR TERNARIO boolean resultado = (random==0)?true:false;
		 * System.out.println(resultado); System.out.println(1==2);
		 */
		
		
		System.out.println("---------------- CLIMAS ---------------------");
		
		double grados = 13.5;		
		if(grados<=10) {
			System.out.println("CLIMA FRIO");
			System.out.println("---------------------------");
			if(grados>=5) {
				System.out.println("alta montaña");
			}else {
				System.out.println("clima polar");
			}
		}else if(grados>=10 & grados<20) {
			System.out.println("CLIMAS TEMPLADOS");
			System.out.println("---------------------------");
			if(grados<13.5) {
				System.out.println("clima oceanico");
			}else if(grados>=13.5 & grados<16.5) {
				System.out.println("clima mediterraneo");
				
			}else {
				System.out.println("clima continental");
			}
		}else if (grados>=20) {
			System.out.println("CLIMA CALIDO");
			System.out.println("---------------------------");
			if(grados<23) {
				System.out.println("clima ecuatorial");
			}else if(grados>23 & grados<26.5) {
				System.out.println("clima tropical");
			}else {
				System.out.println("clima desertico");
			}
		}
		
		
	}

}
