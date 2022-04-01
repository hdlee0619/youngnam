package BankSystem;

public class BankDriver {
	public static void main(String[] args) {
		// 사람선언
		Person p1 = new Person(); // 생성자
//		p1.name = "김신의";
//		p1.age = 28;
//		p1.setAge(24);
//		p1.cashAmount = 30000;
		
		// private 적용해 이름, 나이, 현금보유 설정
		p1.setName("김신의");
		p1.setAge(28);
//		p1.setAge(-17); // 테스트
		p1.setCashAmount(30000);
//		p1.setCashAmount(-2000); // 테스트
		
		// 은행 계좌 생성
		BankAccount a1 = new BankAccount();
		a1.setBalance(100000);
		
		// 두 객체의 관계 설정
		p1.setAccount(a1);
		a1.setOwner(p1);
		
		// 사람선언
		Person p2 = new Person();
//		p2.name = "이현동";
//		p2.age = 24;
//		p2.cashAmount = 100000;
		
		// private 적용
		p2.setName("이현동");
		p2.setAge(25);
		p2.setCashAmount(100000);
		
		// p2의 은행 계좌 생성
		BankAccount a2 = new BankAccount();
		a2.setBalance(500000);
		
		// 두 객체의 관계 설정
		p2.setAccount(a2);
		a2.setOwner(p2);

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
