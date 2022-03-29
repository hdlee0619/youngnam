

public class Helloworld {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		boolean myBoolean = true;
		
		int myInt = 123;
		
		long myLong = 12345678910L;
		
		double myDouble = 3.14;
		
		String myString = "codeit!!"; // 기본자료형이 아님.
		
		System.out.println(myBoolean);
		System.out.println(myLong);
		
		// 자기소개
		
		String myName = "이현동";
		short birthYear = 1998;
		byte birthMonth = 6;
		byte birthDay = 19;
		boolean married = false;
		
		System.out.print("이름: ");
		System.out.println(myName);
		System.out.print("생일: ");
		System.out.print(birthYear);
		System.out.print("년 ");
		System.out.print(birthMonth);
		System.out.print("월 ");
		System.out.print(birthDay);
		System.out.println("일");
		System.out.print("결혼: ");	
		System.out.println(married);
		
		// 연산자와 형변환
		
		int koreanScore, mathScore, scienceScore, computerScore;
		
		koreanScore = 86;
		mathScore = 94;
		scienceScore = 87;
		computerScore = 100;
		double average = (double) (koreanScore + mathScore + scienceScore + computerScore)/4;
		
		System.out.println(average);
		
		// if, else if, else 연습
		int a, b;
		a = 3;
		b = 7;
				
		if (a == b) {
			System.out.println("a와 b는 같습니다.a = b = " + a);
		} else {
			System.out.println("a와 b는 같지 않습니다.");
			if (a > b) {
				System.out.println("a가 b보다 " + (a - b) + "만큼 더 큽니다.");
			} else if (b > a) {
				System.out.println("b가 a보다" + (b - a) + "만큼 더 큽니다.");
			}
		}
		
		//switch문 연습
		
		int x = 13;
		
		switch (x % 7) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default :
			System.out.println("Six");
			break;
		}
		
		// while문 연습
		
		int y = 10000;
		
		while (true) {
			y--;
			if (y % 153 == 0) {
				System.out.println(y);
				break;
			} else {
				continue;
			}
		}
		// 또는
		int key = 153;
		
		while (y % key > 0) {
			y--;
		}
		System.out.println(y);
	
	// for문 연습 - 구구단
	
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
		}
	// 배열 연습
	int[] intAraay = new int[30];
	String[] remainders = {"Zero", "One","Two", "Three"};
	
	for (int h = 0; h < intAraay.length; h++) {
		intAraay[h] = 1001 + h;
	}
	for (int i : intAraay) {
		System.out.println(remainders[i%4]);
	}
	}
}