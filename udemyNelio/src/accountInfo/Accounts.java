package accountInfo;

public class Accounts {
	private String name;
	private int accountNumber;
	private String optionChoose;
	private double balance;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOptionChoose() {
		return optionChoose;
	}

	public void setOptionChoose(String optionChoose) {
		this.optionChoose = optionChoose;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void addAccount(double balance) {
		this.balance += balance;
	}
	
	public void withdrawAccount(double balance) {
		this.balance -= (balance + 5) ;
	}
	
	@Override
	public String toString() {
		return "Accout data: \n" + 
				"Account " + 
				accountNumber + 
				", Holder: "  + 
				name + 
				", Balance: $ " + 
				String.format("%.2f", balance) 
				;
	}


}
