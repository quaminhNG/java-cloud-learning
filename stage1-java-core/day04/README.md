# Day 04: Toán tử trong Java (Operators)

Trong bài học này, chúng ta sẽ tìm hiểu về các loại toán tử phổ biến trong Java, tập trung vào **Toán tử Số học (Arithmetic Operators)** và **Toán tử Logic (Logical Operators)**.

## 1. Toán tử Số học (Arithmetic Operators)

Dùng để thực hiện các phép tính toán học cơ bản.

| Toán tử | Mô tả | Ví dụ (a = 10, b = 3) | Kết quả |
| :--- | :--- | :--- | :--- |
| `+` | Cộng | `a + b` | 13 |
| `-` | Trừ | `a - b` | 7 |
| `*` | Nhân | `a * b` | 30 |
| `/` | Chia (lấy phần nguyên) | `a / b` | 3 |
| `%` | Chia lấy dư (Modulo) | `a % b` | 1 |
| `++` | Tăng 1 đơn vị | `a++` | 11 |
| `--` | Giảm 1 đơn vị | `a--` | 9 |

## 2. Toán tử So sánh (Relational Operators)

Thường dùng trong các câu lệnh điều kiện, trả về giá trị `boolean` (`true` hoặc `false`).

| Toán tử | Mô tả | Ví dụ (a = 10, b = 3) | Kết quả |
| :--- | :--- | :--- | :--- |
| `==` | Bằng | `a == b` | false |
| `!=` | Khác | `a != b` | true |
| `>` | Lớn hơn | `a > b` | true |
| `<` | Nhỏ hơn | `a < b` | false |
| `>=` | Lớn hơn hoặc bằng | `a >= 10` | true |
| `<=` | Nhỏ hơn hoặc bằng | `b <= 5` | true |

## 3. Toán tử Logic (Logical Operators)

Dùng để kết hợp nhiều biểu thức điều kiện.

| Toán tử | Mô tả | Ví dụ (x = true, y = false) | Kết quả |
| :--- | :--- | :--- | :--- |
| `&&` | AND (Và) - Trả về true nếu cả hai đều true | `x && y` | false |
| `||` | OR (Hoặc) - Trả về true nếu ít nhất một cái true | `x || y` | true |
| `!` | NOT (Phủ định) - Đảo ngược giá trị logic | `!x` | false |

---

## Ví dụ Code minh họa

Xem file `OperatorExample.java` trong cùng thư mục để thấy cách hoạt động thực tế.
