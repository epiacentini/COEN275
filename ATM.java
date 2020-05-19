package assign2;
import java.util.ArrayList;

public class ATM {
	private ArrayList<BankAccount> accounts;
	private Encryptor passwordEncoder;
	
	public ATM(int numAccounts, int shifter){
		accounts = new ArrayList<BankAccount>(); // creates account ArrayList
		passwordEncoder = new Encryptor(shifter); //creates Encryptor object
	}
	
	public void addAcount(String accntId, String name, double balance, String password) {
		String newPassword = passwordEncoder.encrypt(password); // encrypts the password
		BankAccount newAcct = new BankAccount(accntId, name, newPassword); // initializes the new account to be added
		newAcct.deposit(balance);
		int i;
		for(i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccntId().contentEquals(accntId)) { // checks if account id already in ArrayList
				System.out.println("Account already exists!");
				return;
			}
				
		}
		accounts.add(newAcct); // adds account if inpunt account ID is unique
		System.out.println("Account Successfully Added");
	}
	
	public double getMoney(String accntId, String password, double amount) {
		int size = accounts.size(); // get the number of accounts in the ArrayList
		int i;
		for(i = 0; i < size; i++) {
			if(accounts.get(i).getAccntId() == accntId && (passwordEncoder.decrypt(accounts.get(i).getPassword()).contentEquals(password.toUpperCase()))) {
				// checks the input id to all the users id, and checks decrypted id to the input id
				if(accounts.get(i).withdraw(amount) == amount){ // confirms if withdraw was successful or not
				System.out.println("$" + amount + " withdrawn");
				return amount;
				}
				else return 0;
			}
		}
		
		System.out.println("Account doesn't exist, password incorrect, or insufficient funds");
		return 0;
	}
	
	public static void main(String[] args) {
		 ATM myATM = new ATM(50, 11); // atm that can handle 50 accounts and encrypts with shift of 11
		 
		 myATM.addAcount("A123", "M.Jones", 2000.00, "fall-quarter");
		 myATM.addAcount("B654", "B.Smith", 100.00, "renaissance");
		 
		 myATM.getMoney("A123", "fall-quarter", 1000.00);
		 myATM.getMoney("B654", "essence", 100.00);
		 myATM.getMoney("B654", "renaissance", 50.00);
		 myATM.getMoney("B654", "renaissance", 50.00);
		 myATM.getMoney("B654", "renaissance", 50.00);
		 
		 myATM.addAcount("A123", "M.Jones", 1000.00, "fall-quarter");
		 
	}
	
}
