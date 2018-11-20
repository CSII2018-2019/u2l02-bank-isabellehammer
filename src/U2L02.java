import java.text.NumberFormat;

public class U2L02 {
	private String userName;
	private int currentBalance;
	private int lowestBalanceAllowed;
	private int withdrawal;
	
	public U2L02 () {
		setName("Not Set");
		setBalance(0);
		setLowest(100);
		setWithdrawal(0);
	}
	
	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public U2L02(String n, int balance, int low, int w) {
		setName(n);
		setBalance(balance);
		setLowest(low);
		setWithdrawal(w);
	}
	
	
	private void setLowest(int low) {
		// TODO Auto-generated method stub
		
	}

	private void setWithdrawal(int w) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return userName;
	}
	
	public int getBalance() {
		return (currentBalance - withdrawal);
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
