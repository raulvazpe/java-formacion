
public class OperadorRelacion {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 2;

		// num 4 es igual que num 2?
		System.out.println("num 4 es igual que num 2? "+ (num4 == num2));

		// num 2 es igual que num 3?
		System.out.println("num 2 es igual que num 3 ? "+(num2 == num3));
		
		// num 1 es distinto que num 3?
		System.out.println("num 1 es distinto que num 3? "+(num2 != num3));
		
		// num 2 es distinto que num 2?
		System.out.println("num 2 es distinto que num 2? "+(num2 != num2));
		
		//num4 es menor al valor de num3
		System.out.println("num4 es menor al valor de num3"+(num4 < num3));
		
		//num3 es menor al valor de num1
		System.out.println("num3 es menor al valor de num1? "+(num3 < num1));
		
		//num1 es menor al valor de num3
		System.out.println("num1 es menor al valor de num3? "+(num1 > num3));
		
		//num2 es mayor al valor de num4
		System.out.println("num2 es mayor al valor de num4? "+(num2 > num4));
		
		//num2 es mayor al valor de num3
		System.out.println("num2 es mayor al valor de num3? "+(num2 > num3));
		
		//num2 es mayor al valor de num3
		System.out.println("num2 es mayor al valor de num3? "+(num2 > num3));
		
		//num2 es menor o igual al valor de num3
		System.out.println("num2 es menor o igual al valor de num3? "+(num2 <= num3));
		
		//num2 es menor o igual al valor de num4
		System.out.println("num2 es menor o igual al valor de num4? "+(num2 <= num4));
		
		//num2 es menor o igual al valor de num1
		System.out.println("num2 es menor o igual al valor de num1? "+(num2 <= num1));
		
		//num1 es mayor o igual al valor de num2
		System.out.println("num1 es mayor o igual al valor de num2? "+(num1 >= num2));
		
		//num1 es mayor o igual al valor de num1
		System.out.println("num1 es mayor o igual al valor de num1? "+(num2 >= num1));
		
		//num1 es mayor o igual al valor de num1
		System.out.println("num1 es mayor o igual al valor de num1? "+(num2 >= num1));
	}

}
