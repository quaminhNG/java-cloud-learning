# Day 05: Cấu trúc điều khiển (Control Flow Statements) trong Java

Chào mừng bạn đến với Day 05! Hôm nay chúng ta sẽ tìm hiểu về cách điều khiển luồng thực thi của chương trình bằng các câu lệnh điều kiện. Đây là kiến thức nền tảng để máy tính có thể "tư duy" và đưa ra quyết định dựa trên dữ liệu.

## 1. Câu lệnh `if-then` (Câu lệnh If cơ bản)

Đây là dạng cơ bản nhất. Nó thực hiện một đoạn mã chỉ khi một điều kiện nhất định là `true`.

```java
if (điều_kiện) {
    // Đoạn mã thực thi nếu điều kiện là true
}
```

## 2. Câu lệnh `if-then-else` (Câu lệnh If-Else)

Cung cấp một con đường thực thi thứ hai khi điều kiện `if` là `false`.

```java
if (điều_kiện) {
    // Thực thi nếu true
} else {
    // Thực thi nếu false
}
```

## 3. Câu lệnh `if-else-if` (Bậc thang If-Else)

Dùng để kiểm tra nhiều điều kiện khác nhau tuần tự. Ngay khi một điều kiện thỏa mãn, các điều kiện còn lại sẽ bị bỏ qua.

```java
if (score >= 90) {
    grade = 'A';
} else if (score >= 80) {
    grade = 'B';
} else {
    grade = 'F';
}
```

## 4. Câu lệnh `switch`

Dùng khi bạn có một biến và muốn so sánh nó với nhiều giá trị cụ thể (hằng số). `switch` thường dễ đọc hơn nhiều câu lệnh `if-else` lồng nhau.

```java
switch (biến) {
    case giá_trị1:
        // Thực thi
        break;
    case giá_trị2:
        // Thực thi
        break;
    default:
        // Thực thi nếu không khớp case nào
}
```

*Lưu ý: Luôn nhớ sử dụng `break` để thoát khỏi case, nếu không chương trình sẽ "rơi" xuống các case tiếp theo.*

---

## Bài tập Thực hành
Xem các file ví dụ trong cùng thư mục:
1. `IfElseDemo.java`: Minh họa cách dùng If-Else để xếp loại học lực.
2. `SwitchDemo.java`: Minh họa cách dùng Switch để hiển thị tên tháng hoặc ngày trong tuần.

Tài liệu tham khảo: [Java Tutorials - If Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
