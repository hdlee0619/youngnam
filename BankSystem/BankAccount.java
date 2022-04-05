package BankSystem;

public class BankAccount {
	private int balance; // 계좌 잔액
	private Person owner;

	// 생성자
	public BankAccount(int balance) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}
	public BankAccount(Person owner) {
		this.owner = owner;
		balance = 0;
		owner.setAccount(this); // BankDriver 에서 p1.setAccount(a1) 코드 대체
	}
	public BankAccount(int balance, Person owner) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
		this.owner = owner;
		owner.setAccount(this); // BankDriver 에서 p1.setAccount(a1) 코드 대체
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public Person getOwner() {
		return owner;
	}

	// 파라미터 : 입금할 액수 (정수)
	// 리턴 : 성공여부 (불린)
	boolean deposit(int amount) {
		if (amount <= 0 || amount > owner.getCashAmount()) {
			System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
			return false;
		} else {
			owner.setCashAmount(owner.getCashAmount() - amount);
			balance += amount;
			System.out.println(amount + "원 " + "입금하였습니다. 잔고: " + balance + "원, 현금 :" + owner.getCashAmount() + "원" );
			return true;
		}
	}
	
	// 파라미터 : 출금할 액수 (정수)
	// 리턴 : 성공여부 (불린)
	boolean withdraw(int amount) {
		if (amount <= 0 || amount >= balance) {
			System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
		return false;
		} else {
			owner.setCashAmount(owner.getCashAmount() + amount);
			balance -= amount;
			System.out.println(amount + "원 " + "출금하였습니다. 잔고: " + balance + "원, 현금 :" + owner.getCashAmount() + "원" );
			return true;
		}
	}

	// 첫 번째 파라미터 : 받는 사람의 계정 (BankAccount)
	// 두 번째 파라미터 : 이체할 금액 (정수)
	// 리턴 : 성공 여부 (불린)
	public boolean transfer(BankAccount to, int amount) {
		boolean success;
		if (amount < 0 || amount > balance) {
			System.out.println("false - from: " + owner.getName() + ", to: " + to.owner.getName()
					+ ", amount: " + amount + ", balance: " + getBalance());
			success = false;
		} else {
			balance -= amount;
			to.balance += amount;
			System.out.println("true - from: " + owner.getName()
					+ ", to: " + to.owner.getName()
					+ ", amount: " + amount
					+ ", balance: " + balance);
			success = true;
		}
		return success;
	}

	// 첫 번째 파라미터 : 받는 사람 (Person)
	// 두 번째 파라미터 : 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	public boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(), amount);
	}
}
