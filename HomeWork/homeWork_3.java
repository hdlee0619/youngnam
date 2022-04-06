package HomeWork;

import java.util.Scanner;

public class homeWork_3 {
    public static void sort(int[] array) {
        // 배열에 정수 입력
        System.out.println("정수 " + array.length + "개를 입력하세요 (빈칸으로 분리하여 입력할 것)");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // 배열의 숫자들을 비교해 최대값을 찾고 인덱스 마지막부터 순서대로 넣기
        for (int i = array.length - 1; -1 < i; i--) {
            for (int j = i - 1; -1 < j; j--) {
                if (array[i] < array[j]) {
                    int num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }
//        왼쪽부터 채우는 코드
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        // 입력된 배열 출력
        System.out.print("정렬된 배열 출력 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        sort(new int[10]);
    }
}
