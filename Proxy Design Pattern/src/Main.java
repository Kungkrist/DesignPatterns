
public class Main {

	public static void main(String[] args) {
		
		// Create an account.
		Account account = new Account("Dea");
		
		// Deposit some money to the account.
		account.deposit(2000.0);
		
		// Withdraw some money from the account.
		account.withdraw(249.23);
		
		// Create a proxy that restricts the use of the account (cannot deposit or withdraw).
		IAccountData proxy = new AccountProxy(account);
		System.out.println("Account holder: " + proxy.accountHolder() + ", amount of money left: " + proxy.getCurrentMoney());
		
		// More or less the same as the proxy, except that the proxy-class can contain some more implementations.
		IAccountData p = account;
		System.out.println("Account holder: " + p.accountHolder() + ", amount of money left: " + p.getCurrentMoney());
		
		/*
		 * Withdraw some money from the account & do a printout again.
		 */
		account.withdraw(1000.0);
		System.out.println("Account holder: " + proxy.accountHolder() + ", amount of money left: " + proxy.getCurrentMoney());

	}

}
