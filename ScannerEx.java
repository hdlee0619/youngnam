/*
 * 모바일 앱 만들기 Homework #1
 * Scanner를 이용하여 값을 입
 */

import java.util.Scanner;

public class ScannerEx {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("21711112 이현동");
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.");
		System.out.println("당신의 나이는 " + in.nextInt() + "살입니다.");
		System.out.println("당신의 체중은 " + in.nextDouble() + "kg입니다.");
		System.out.println("당신의 신장은 " + in.nextDouble() + "cm입니다.");
	}
}