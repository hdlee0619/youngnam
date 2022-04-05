package BankSystem;

public class BankDriver {
	public static void main(String[] args) {
		// 생성자를 이용한 사람 선언
		Person p1 = new Person("김신의", 27);
		p1.setCashAmount(30000);

		Person p2 = new Person("문종모", 25, 100000);

		// 생성자를 이용한 계좌 선언
		BankAccount a1 = new BankAccount(p1);
		a1.setBalance(100000);

		BankAccount a2 = new BankAccount(500000, p2);
		
		// 두 객체의 관계 설정
		p1.setAccount(a1);

		// 두 객체의 관계 설정
		p2.setAccount(a2);

		// 입출금 테스트
//		System.out.println(a2.deposit(30000)); // 30000원 입금
//		System.out.println(a2.withdraw(170000)); // 170000원 출금
//		System.out.println(a2.deposit(620000)); // 620000원 입금
//		System.out.println(a2.withdraw(360000)); // 360000원 출금

		// 계좌 이체 테스트
		a2.transfer(a1, 200000);
		a1.transfer(p2, 150000);
		p2.transfer(a1, 270000);
		p1.transfer(p2, 130000);
	}
}