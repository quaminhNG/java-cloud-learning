# Day 06: Cấu trúc lặp (Looping Statements) trong Java

Chào mừng bạn đến với Day 06! Hôm nay chúng ta sẽ tìm hiểu về cách lặp lại các công việc nhiều lần một cách tự động bằng các vòng lặp `for` và `while`. Đây là kỹ thuật cực kỳ quan trọng giúp chúng ta xử lý các tập dữ liệu lớn và các tác vụ lặp đi lặp lại một cách hiệu quả.

## 1. Vòng lặp `for` (For Loop)

Vòng lặp `for` cung cấp một cách ngắn gọn để viết các vòng lặp cần thực hiện một số lần xác định. Nó bao gồm ba phần: khởi tạo, điều kiện, và bước thay đổi.

```java
for (khởi_tạo; điều_kiện; bước_thay_đổi) {
    // Đoạn mã thực thi lặp lại
}
```

*Ví dụ:* Lặp từ 1 đến 5.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Lần lặp thứ: " + i);
}
```

## 2. Vòng lặp `while` (While Loop)

Vòng lặp `while` liên tục thực thi một khối lệnh chừng nào điều kiện được chỉ định còn là `true`.

```java
while (điều_kiện) {
    // Đoạn mã thực thi
}
```

*Ví dụ:* Lặp trong khi biến `count < 5`.

```java
int count = 0;
while (count < 5) {
    System.out.println("Count is: " + count);
    count++; // Đừng quên tăng count nếu không sẽ bị lặp vô hạn!
}
```

## 3. Vòng lặp `do-while` (Do-While Loop) - *Mở rộng*

Khác với `while`, vòng lặp `do-while` sẽ thực thi khối mã **ít nhất một lần** trước khi kiểm tra điều kiện.

```java
do {
    // Thực thi ít nhất một lần
} while (điều_kiện);
```

## 4. Các câu lệnh điều khiển vòng lặp: `break` và `continue`

- `break`: Thoát khỏi vòng lặp ngay lập tức.
- `continue`: Bỏ qua các lệnh còn lại trong lần lặp hiện tại và chuyển sang lần lặp kế tiếp.

---

## Bài tập Thực hành

Xem các file ví dụ trong cùng thư mục:
1. `ForLoopDemo.java`: Minh họa cách dùng vòng lặp `for` để in bảng cửu chương.
2. `WhileLoopDemo.java`: Minh họa cách dùng vòng lặp `while` để tính tổng các số từ 1 đến N.

Tài liệu tham khảo: [Java Tutorials - Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
