package maccess;

public class AccountDetails {
   private int accountNumber;
	private String name;
	private double balance;
	private Address abc;
	
	public AccountDetails(int accountNumber, String name, double balance, Address abc) {
		super();
		System.out.println("All Params Constructor of AccountDetails");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.abc = abc;
	}
	
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Address getAbc() {
		return abc;
	}
	public void setAbc(Address abc) {
		this.abc = abc;
	}
	
}
