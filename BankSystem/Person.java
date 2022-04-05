package BankSystem;

public class Person {
	private String name; // private를 이용해 접근제어를 줌.
	private int age; //  해당 클래스 내에 age를 사용하고 return해주는 메소드를 추가해야함.
	private int cashAmount;
	private BankAccount account;

	// 생성자
	public Person(String name) {
		this(name, 12, 0); // 12살을 기본나이로 설정, 초기 현금 보유액은 0으로 설정된 파라미터를 3번째 Person 생성자에 넘겨줌
	}
	public Person(String name, int age) {
		this(name, age, 0);
	}
	public Person(String name, int age, int cashAmount) {
		if (age <0) {
			this.age = 12;
		} else {
			this.age = age;
		}
		if (cashAmount < 0) {
			this.cashAmount = 0;
		} else {
			this.cashAmount = cashAmount;
		}
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	
	public int getCashAmount() {
		return cashAmount;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public boolean transfer(Person to, int amount) {
		return account.transfer(to.getAccount(), amount);
	}

	public boolean transfer(BankAccount to, int amount) {
		return account.transfer(to, amount);
	}
}