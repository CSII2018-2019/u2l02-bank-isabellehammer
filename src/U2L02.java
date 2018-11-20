
public class U2L02 {
	private String userName;
	private int currentBalance;
	
	public U2L02 () {
		setName("Not Set");
		setBalance(0);
	}
	
	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public U2L02(String n, int balance, int low) {
		setName(n);
		setBalance(balance);
	}
	
	public String getName() {
		return userName;
	}
	
	public int getBalance() {
		return currentBalance;
	}
	
	public void setBalance(int balance) {
		if (balance >= 100) {
			currentBalance = balance;
		}else {
			currentBalance = 100;
			System.out.println("The lowest balance allowable is $100. Defaulting to 100.");
		}
	}
	
	public String toString() {
		return getName() + ", you have $" + getBalance() + " in your account.";
	}
	
}
