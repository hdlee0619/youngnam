package BankSystem;

public class Person {
	private String name; // private를 이용해 접근제어를 줌.
	private int age; //  해당 클래스 내에 age를 사용하고 return해주는 메소드를 추가해야함.
	private int cashAmount;
	private BankAccount account;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		if (newAge >= 0) {
			age = newAge;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setCashAmount(int newCashAmount) {
			cashAmount = newCashAmount;
	}
	
	public int getCashAmount() {
		return cashAmount;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public void setAccount(BankAccount pAccount) {
		account = pAccount;
	}
}