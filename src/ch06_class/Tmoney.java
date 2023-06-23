package ch06_class;

public class Tmoney {
	
	private int age;
	private int cash;
	public static final int CHILD_FARE = 730;
	public static final int YOUTH_FARE = 1010;
	public static final int ADULT_FARE = 1450;
	
	public Tmoney(int age) {
		this(age, 0);
	}
	public Tmoney(int age, int cash) {
		if (age >=0 && age <=150)
			this.age = age;
		if (cash >= 0 )
			this.cash = cash;
	}

	public int getCash() {
		return cash;
	}
	public void charge(int cash) {
		this.cash += cash;
	}
	
	@Override
	public String toString() {
		return "Tmoney [age=" + age + ", cash=" + cash + "]";
	}
	
	public boolean ride() {
		if (this.age >= 7 && this.age <= 12) {
			
			if (this.cash < this.CHILD_FARE) 
				return false;
			else 
				this.cash -= this.CHILD_FARE; return true;
				
		} else if (this.age >= 13 && this.age <= 18) {
			
			if (this.cash < this.YOUTH_FARE) 
				return false;
			else 
				this.cash -= this.YOUTH_FARE; return true;
			
		} else if (this.age >= 19){
			
			if (this.cash < this.ADULT_FARE) 
				return false;
			else 
				this.cash -= this.ADULT_FARE; return true;
			
		}
		
		return true;
		
	}
	
	
}
