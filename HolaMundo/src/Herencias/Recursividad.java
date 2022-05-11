
public class Recursividad {

	public static void main(String[] args) {
		
		//FIBONACCI
		
		
		
		//SUMA RECURSIVA
		System.out.println("-----------SUMA DE NUMEROS DE FORMA RECURSIVA-------------------");
		int n = 9;
		int resultdo = sumaRecursiva(n);
		System.out.print(" "+resultdo);
		System.out.println("");
		
		
		
		
		//MOSTRARARRAYRECURSIVA
		System.out.println("--------------RECORRE UN ARRAY DE FORMA RECURSIVA HASYA LLEGAR A HTML--------------------");
		String[] teconologies = {"Markdown","Regexp","HTML","CSS","JS","JAVA","SQL"};
		mostrarArrayRecursiva(teconologies, 0);
		
		
		System.out.println("--------------FIBONACCI--------------------");
		//FIBONACCI	
		//System.out.println(fibonacci(5));
		
		//INVERTIR SUPERCALIFRAGILISTICOESPIALIDOSO
		System.out.println("--------------INVERTIR PALABRA--------------------");
		
		String palabra = "supercalifragilisticoespialidoso";
		
		int index = palabra.length();
		System.out.println(index);
		invertir(palabra,index);
		}
	

	
	

	//FUNCIONES--------------------------------------------------
	
	public static int invertir(String palabra,int index) {
		//System.out.println(palabra.length());
		//int index=0;
		
		if(index==0){
			//System.out.println("entra");
			return 0;
			//return palabra.charAt(0);
		}else {
			index --;
			System.out.print(palabra.charAt(index));
			
			return invertir(palabra,index);
		}
		
		
	}
	
	
	
	//RECORRE UN ARRAY DE FORMA RECURSIVA HASYA LLEGAR A HTML
	public static void mostrarArrayRecursiva(String[]array,int posicion){
		
		if(array[posicion]=="HTML") {
			System.out.println(array[posicion]);
		}else {
			System.out.println(array[posicion]);
			mostrarArrayRecursiva(array, posicion+1);
			
		}
	}
		
		
	public static int fibonacci(int n) {
		if(n==1) {
			
			return 1;
	
		}else if(n==0){
			return 0;
			
		}else {
			//return (n-1)+(n-2);
			//System.out.println(fibonacci(n));
			//return 5;
			return fibonacci(n) + fibonacci(n); //funcion recursiva
		}
		
		
	
	
	}



//SUMA LOS NUMEROS PASADOS POR PARAMETROS DE FORMA RECURSIVA

	public static int sumaRecursiva(int num) {
		int res;
		if(num==1) {
			return 1;	
		}else {
			if(num>2) {
				System.out.print(num+" + ");
			}else {
				System.out.print(num+" + 1 =");
			}
			res = num + sumaRecursiva(num-1);
			
		}
		return res;
	}

}
