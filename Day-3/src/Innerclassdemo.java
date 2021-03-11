
public class Innerclassdemo {
public static void main(String[] args) {
	Account[] account=new Account[10];
	/*for(int i=0;i<account.length;i++)
	{
		Account accounts=new Account("Account"+i);
		account[i]=accounts;
	}*/
}
}

class Account
{
public Account() {
		this.addresses=new Address[3];
	}

public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public Address[] getAddresses() {
	return addresses;
}

public void setAddresses(Address[] addresses) {
	this.addresses = addresses;
}
private Address[] addresses;
private int number;

private class Address
{
	private String addressname;
	
}
}