package assign2;

public class BankAccount {
	private String accntId;
	private String name;
	private double balance;
	private String password;
	
	public BankAccount(String accntsId, String accntname, String accntpassword) { // constructor for bank account
		accntId = accntsId;
		name = accntname;
		password = accntpassword;
		balance = 0;
	}
	
	public double withdraw(double amount) {
		if(amount > 0 && amount <= balance) // checks if amount is positive number that is less than balance
			balance -= amount;
		else if(amount < 0 || amount > balance) { // sees if amount is negative or less than balance
			System.out.println("Insufficent Funds or Invalid Withdrawal Amount");
			return 0;
		}
		return amount;
		
	}
	
	public void deposit(double amount) {
		if(amount > 0)
			balance += amount; // subtracts amount from balance if amount is positive non-zero number
		
		return;
	}

	public String getAccntId() {
		return accntId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}
	
}
