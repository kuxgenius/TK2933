package Practice4c;

public class SavingAccount {
	
	private double balance;
	
	public SavingAccount (double amount) {
		this.balance = amount;
	}
	
	void addInterest () {
		this.balance = this.balance + (this.balance * 0.03);
	}
	
	double getBalance() {
		return this.balance;
	}
}
