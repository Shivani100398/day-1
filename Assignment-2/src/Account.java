
public class Account {

	private String name;
	private float balance;
	
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	 
	return "{Name: "+this.name+", Balance: "+this.balance+"}";
}

}
