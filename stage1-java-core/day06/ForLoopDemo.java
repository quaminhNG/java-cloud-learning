/**
 * Day 06: Minh họa vòng lặp for trong Java
 */
public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("--- Ví dụ 1: In các số từ 1 đến 5 ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n--- Ví dụ 2: Bảng cửu chương 7 ---");
        int n = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }

        System.out.println("\n--- Ví dụ 3: Duyệt ngược từ 10 về 1 ---");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
