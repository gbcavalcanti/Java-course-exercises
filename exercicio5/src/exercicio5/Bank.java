package exercicio5;

public class Bank {
	
	private Integer account;
	
	private String name;

	private Double amount;


	
	public Bank(Integer account, String name) {
		this.account = account;
		this.name = name;
		amount = 0.0;
		
	}

	public Integer getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void deposit(Double amount) {
			this.amount += amount;
	}
	
	public void withdraw(Double amount) {
			this.amount -= amount + 5;
	}

	@Override
	public String toString() {
		return " Account data:\nAccount " + account + ", Holder:" + name + ", Balance: $" + amount + "\n";
	}
	
	
}
