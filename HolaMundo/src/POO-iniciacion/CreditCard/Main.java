package CreditCard;

public class Main {

	public static void main(String[] args) {
	
		CreditCard card1  = new CreditCard();
		System.out.println(card1.activar());
		System.out.println(card1.pagar(25));
		System.out.println(card1.anular());
		

	}

}
