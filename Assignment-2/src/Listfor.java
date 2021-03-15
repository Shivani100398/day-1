import java.util.ArrayList;
import java.util.List;

public class Listfor {
public static void main(String[] args) {
	demo();
	
}
public static void demo()
{
  List <Account>accounts=new ArrayList<Account>();	
for (int i = 0; i < 10; i++) {
	Account account=new Account("RAM "+i);
	account.setBalance(100+i);
	accounts.add(account);

}
System.out.println(accounts);
}
}

