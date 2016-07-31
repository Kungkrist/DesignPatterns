
public class Account implements IAccountData{
	private String accountHolder;			// name of the account holder.
	private double amountOfMoney = 0.0;		// amount of money in the account.
	
	/**
	 * 
	 * @param accountHolder - name of the account holder.
	 */
	public Account(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	/**
	 * Deposit money to the account.
	 * @param amount - the amount that will be deposited.
	 */
	public void deposit(double amount) {
		this.amountOfMoney += amount;
	}
	
	/**
	 * Withdraw money from the account.
	 * @param amount - the amount that will be withdrawn.
	 */
	public void withdraw(double amount) {
		if(amount > this.amountOfMoney) {
			System.out.println("You don't have that kind of money.");
		} else {
			this.amountOfMoney -= amount;
		}
	}

	@Override
	public String accountHolder() {
		return this.accountHolder;
	}

	@Override
	public double getCurrentMoney() {
		return this.amountOfMoney;
	}

}
