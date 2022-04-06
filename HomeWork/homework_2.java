package HomeWork;

public class homework_2 {
    public static void printMultTable(int high) {
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        printMultTable(7);
    }
}