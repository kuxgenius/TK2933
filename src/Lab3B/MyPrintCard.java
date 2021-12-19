package Lab3B;

class MyPrintCard {

	private double balance;
	
	public MyPrintCard() {
		balance = 10.00;
	}
	
	double getBalance() {
		return balance;
	}
	
	void topupCard(double amt) {
		this.balance += amt;
	}
	
	boolean payService(double amt) {
		if ((this.balance - amt) >= 5.00) {
			this.balance -= amt;
			return true;
		}
		else
			return false;
	}
}
