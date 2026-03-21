/**
 * Day 06: Minh họa vòng lặp while và do-while trong Java
 */
public class WhileLoopDemo {
    public static void main(String[] args) {
        System.out.println("--- Ví dụ 1: Sử dụng While Loop ---");
        int i = 1;
        while (i <= 5) {
            System.out.println("Giá trị i: " + i);
            i++;
        }

        System.out.println("\n--- Ví dụ 2: Tính tổng các số từ 1 đến 10 ---");
        int sum = 0;
        int count = 1;
        while (count <= 10) {
            sum += count;
            count++;
        }
        System.out.println("Tổng từ 1 đến 10 là: " + sum);

        System.out.println("\n--- Ví dụ 3: Sử dụng Do-While Loop ---");
        int j = 1;
        do {
            System.out.println("Giá trị j (do-while) vẫn được in 1 lần: " + j);
            j++;
        } while (j <= 0); // Sẽ in 1 lần duy nhất dù điều kiện sai ngay từ đầu
    }
}
