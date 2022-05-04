
public class Banderas {

	public static void main(String[] args) {
		
		
	/*	//UCRANIA
		bandera(blue,6);
		bandera(yellow,6);
		
		espacio();
		
		//ESPAÑA
		bandera(red,3);
		bandera(yellow,5);
		bandera(red,3);
		
		espacio();
		*/
		//CATALUÑA
		bandera(yellow,1);
		bandera(red,1);
		bandera(yellow,1);
		bandera(red,1);
		bandera(yellow,1);
		bandera(red,1);
		bandera(yellow,1);
		bandera(red,1);
		bandera(yellow,1);
	}
	static String blue = "\033[0;44m \033[0m";
	static String yellow = "\033[0;43m \033[0m";
	static String red = "\033[0;41m \033[0m";
	
	public static void bandera(String color,int lineas){
		for(int b = 0; b<lineas; b++) {
			System.out.println("");
			for(int y = 0; y<40; y++) {
				System.out.print(color);
			}
			
		}
	}
	
	public static void espacio() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
