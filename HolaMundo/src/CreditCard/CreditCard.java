package CreditCard;





public class CreditCard {
private String entidadEmisora;
private int numero;
private String titular;
private String fecha;

//CONSTRUCTORES
public CreditCard() {
	this.entidadEmisora = "SAntander";
	this.numero= 1233443512;
	this.titular="Raul Vazquez";
	this.fecha="20/02/2025";
}



public CreditCard(String entidadEmisora, int numero, String titular, String fecha) {
	this.entidadEmisora = entidadEmisora;
	this.numero = numero;
	this.titular = titular;
	this.fecha = fecha;
}


//METODOS

public String activar() {
		//this.numero = numero;
		return "Se ha activado correctamente";
	}
	
public String pagar(int pago) {
	return "Has pagado: "+pago+"€";
}

public String anular() {
	//this.numero = numero;
	return "Has anulado la tarjeta";
}

//GETTERS Y SETTERS


public String getEntidadEmisora() {
	return entidadEmisora;
}


public void setEntidadEmisora(String entidadEmisora) {
	this.entidadEmisora = entidadEmisora;
}


public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}


public String getTitular() {
	return titular;
}


public void setTitular(String titular) {
	this.titular = titular;
}


public String getFecha() {
	return fecha;
}


public void setFecha(String fecha) {
	this.fecha = fecha;
}





}
