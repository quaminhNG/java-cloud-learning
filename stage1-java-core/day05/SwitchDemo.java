package stage1_java_core.day05;

/**
 * Demo Switch statement trong Java.
 * Hiển thị tên ngày trong tuần dựa trên số (1-7).
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int day = 3; // Ví dụ ngày thứ 3 trong tuần
        String dayName;

        switch (day) {
            case 1:
                dayName = "Thứ Hai (Monday)";
                break;
            case 2:
                dayName = "Thứ Ba (Tuesday)";
                break;
            case 3:
                dayName = "Thứ Tư (Wednesday)";
                break;
            case 4:
                dayName = "Thứ Năm (Thursday)";
                break;
            case 5:
                dayName = "Thứ Sáu (Friday)";
                break;
            case 6:
                dayName = "Thứ Bảy (Saturday)";
                break;
            case 7:
                dayName = "Chủ Nhật (Sunday)";
                break;
            default:
                dayName = "Ngày không hợp lệ (Invalid day range: 1-7)!";
                break;
        }

        System.out.println("Ngày thứ " + day + " là: " + dayName);
        
        // Ví dụ một câu lệnh switch khác (tháng)
        int month = 10;
        int numDays = 0;
        
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                numDays = 28; // Giả sử năm không nhuận
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
                break;
        }
        
        if (numDays > 0) {
            System.out.println("Tháng " + month + " có " + numDays + " ngày.");
        }
    }
}
