package Herencias;

public class Programmer extends Employee {
private	int bonus;

//CONSTRUCTOR
public Programmer(float salary, int bonus) {
	super(salary);
	this.bonus = bonus;
}


public Programmer(float salary) {
	super(salary);
}


//GETTERS Y SETTERS


public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}
	



	
	
}
