/*
 * 한 회사의 지난 3년간 분기별 매출의 총액과
 * 연평균 매출을 구하는 프로그램을 작성하시오
 */

public class SalesRevenue {
    public static void main(String[] args) {
        int[][] intArray = {{90, 90, 110, 110}, // 1년간 3분기 동안의 매출
                {120, 110, 100, 110},  // 1년간 3분기 동안의 매출
                {120, 140, 130, 150}};  // 1년간 3분기 동안의 매출
        double dSum = 0;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                dSum += intArray[i][j];
            }
        }
        System.out.println("지난 3년간 매출 총액은 " + dSum + "이며 연평균 매출은 " + dSum / (intArray.length) + "입니다.");
    }
}