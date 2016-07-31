
public class AccountProxy implements IAccountData{
	private IAccountData account;
	
	/**
	 * Used to restrict access to a specified account.
	 * @param account - the account that will be restricted.
	 */
	public AccountProxy(IAccountData account) {
		this.account = account;
	}

	@Override
	public String accountHolder() {
		System.out.println("I did some more stuff.");
		return this.account.accountHolder();
	}

	@Override
	public double getCurrentMoney() {
		return this.account.getCurrentMoney();
	}

}
