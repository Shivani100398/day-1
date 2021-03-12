
public class Bank {
public static void main(String[] args) {
	IAccount accounts[]=new IAccount[3];
	accounts[0]=new FDAccount();
	accounts[1]=new SavingAccount();
	accounts[2]=new RecurringAccount();
	for(IAccount iaccount:accounts)
	{iaccount.deposit();}
}
}
