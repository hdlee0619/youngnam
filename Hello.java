/*
*맛보기 예제
*소스파일 :Hello.java
*/

public class Hello {
	
	static int sum(int n, int m) {
		return n + m; // 30 리
	}

	// main() 메소드에서 실행 시작
	public static void main(String[] atgs) {
		int i = 20; // 선언과 초기값을 한번에 설정한 경우
		int s;
		char a;
		
		s = sum(i, 10); // sum() 메소드 호출
		a = '?';
	System.out.println(a); // 문자 '?' 화면 출력
	System.out.println("Hi"); // Hi 문자열 화면 출력
	System.out.println(s); // 정수 s 값 화면 출
	}
}
