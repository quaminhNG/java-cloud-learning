package stage1_java_core.day05;

/**
 * Demo If-Else trong Java.
 * Xếp loại học lực dựa trên điểm số.
 */
public class IfElseDemo {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Điểm: " + testscore);
        System.out.println("Xếp loại = " + grade);
        
        // Ví dụ một câu lệnh If-Else đơn giản khác
        boolean isMoving = true;
        int currentSpeed = 10;
        
        if (isMoving) {
            currentSpeed--; // Giảm tốc độ nếu đang di chuyển
            System.out.println("Đang giảm tốc, tốc độ hiện tại: " + currentSpeed);
        } else {
            System.err.println("Xe đã dừng hẳn, không thể giảm tốc!");
        }
    }
}
