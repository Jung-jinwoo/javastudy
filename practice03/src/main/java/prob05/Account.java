package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}

	public int save(int money) {
		balance += money;
		System.out.println(accountNo + " 계좌에" + money + "만원이 입금되었습니다.");
		return balance;
	}
	
	public int deposit(int money) {
		balance -= money;
		System.out.println(accountNo + " 계좌에" + money + "만원이 출금되었습니다.");
		return balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
