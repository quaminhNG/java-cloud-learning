package stage1_java_core.day04;

public class OperatorExample {
    public static void main(String[] args) {
        // 1. Toán tử Số học
        int a = 10;
        int b = 3;

        System.out.println("--- Toán tử Số học ---");
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (chia nguyên)
        System.out.println("a % b = " + (a % b)); // 1 (chia dư)

        // 2. Toán tử Logic
        boolean isSunny = true;
        boolean hasUmbrella = false;

        System.out.println("\n--- Toán tử Logic ---");
        System.out.println("isSunny && hasUmbrella: " + (isSunny && hasUmbrella)); // false
        System.out.println("isSunny || hasUmbrella: " + (isSunny || hasUmbrella)); // true
        System.out.println("!isSunny: " + (!isSunny)); // false

        // 3. Kết hợp So sánh và Logic
        int age = 20;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("\nBạn đủ điều kiện lái xe ô tô.");
        } else {
            System.out.println("\nBạn chưa đủ điều kiện lái xe.");
        }
    }
}
