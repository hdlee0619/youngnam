package BankSystem;

public class BankDriver {
	public static void main(String[] args) {
		// 사람선언
		Person p1 = new Person(); // 생성자
		p1.name = "김신의";
		p1.age = 28;
		p1.cashAmount = 30000;
		
		// 은행 계좌 생성
		BankAccount a1 = new BankAccount();
		a1.balance = 100000;
		
		// 두 객체의 관계 설정
		p1.account = a1;
		a1.owner = p1;
		
		// 사람선언
		Person p2 = new Person();
		p2.name = "이현동";
		p2.age = 24;
		p2.cashAmount = 100000;
		
		// p2의 은행 계좌 생성
		BankAccount a2 = new BankAccount();
		a2.balance = 500000;
		
		// 두 객체의 관계 설정
		p2.account = a2;
		a2.owner = p2;
		
		System.out.println(a2.deposit(30000)); // 30000원 입금
		System.out.println(a2.withdraw(170000)); // 170000원 출금
		System.out.println(a2.deposit(620000)); // 620000원 입금
		System.out.println(a2.withdraw(360000)); // 360000원 출금
	}
}
