
public class ArbolNavidad {

	public static void main(String[] args) {

		copaArbol();
	}

	public static String spacing(int spaces, int stars) {
		char caracter = ' ';
		System.out.printf("%" + spaces + "s", caracter);
		System.out.print(stars(stars));
		System.out.printf("%" + spaces + "s\n", caracter);
		return "";
	}

	public static String stars(int stars) {
		String estrellitas = "";
		for (int i = 0; i < stars; i++) {
			estrellitas += "\033[0;42m*\033[0m";
		}
		return estrellitas;
	}

	public static void copaArbol() {

		int espacio = 30;
		int estrellas = 1;
		System.out.println();
		System.out.println("----------ARBOL DE NAVIDAD-------------");
		System.out.println();

		for (int i = 0; i < 10; i++) {

			spacing(espacio, estrellas);
			espacio = espacio - 1;
			estrellas = estrellas + 2;

		}for (int i = 0; i < 4; i++) {
			spacing(29,3);
		}

	}
	
	
}
