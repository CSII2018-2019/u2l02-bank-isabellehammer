import java.text.NumberFormat;

public class U2L02 {
	private String userName;
	private int currentBalance;
	private int lowestBalanceAllowed;
	
	public U2L02 () {
		setName("Not Set");
		setBalance(0);
		setLowest(100);
	}
	
	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public U2L02(String n, int balance, int low) {
		setName(n);
		setBalance(balance);
		setLowest(low);
	}
	
	public String getName() {
		return userName;
	}
	
	public int getBalance() {
		return currentBalance;
	}
	
	public int getLowest() {
		return lowestBalanceAllowed;
	}
	
	public void setBalance(int balance) {
		if (balance >= lowestBalanceAllowed) {
			currentBalance = balance;
		}else {
			System.out.println("Your account has less than $100. Are you okay with that?");
		}
	}
	
	double money = getBalance();
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	String moneyString = formatter.format(money);
	
	
	public String toString() {
		return getName() + ", you have $" + moneyString + " in your account.";
	}
	
}
