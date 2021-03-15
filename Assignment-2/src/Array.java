import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array {
	

	public static void main(String[] args) {
		Account[] account=new Account[10];
		for (int i = 0; i < account.length; i++) {
			Account accounts=new Account("Ram"+i);
			accounts.setBalance(100.0F+i);
			account[i]=accounts;
		}
		for (int j = 0; j < account.length; j++) {
			System.out.println(account[j].getName()+" "+account[j].getBalance());
		}
		List <Account>accounts=new ArrayList<Account>();
		for (int i = 0; i < account.length; i++) {
		      accounts.add(account[i]);
			
		}
			System.out.println("Size of list=="+accounts.size());
			System.out.println(accounts);
		}
}

