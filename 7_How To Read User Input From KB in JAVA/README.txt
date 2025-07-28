Giới thiệu:
Dùng lớp Scanner để đọc dữ liệu từ bàn phím.

Các hàm và cú pháp phổ biến:
- Scanner sc = new Scanner(System.in);
- sc.nextInt(), sc.nextDouble(), sc.nextLine()
- sc.close(); // Đóng scanner khi xong
- hoặc dùng try-with-resources không cần đóng file.
- Lưu ý, nếu lệnh sau là nextLine() mà trước đó là nextInt() hay ... thì phải có một dòng sc.nextLine() tránh trôi lệnh 
(nhập dấu enter do những cái trước tạo ra.)

Thư viện cần import:
import java.util.Scanner; hoặc import java.util.* là đủ;

Bài tập thực hành:
1. Nhập tên và in ra 'Xin chào, [tên]'.
2. Nhập 2 số và in ra tổng.
2. Nhập chuỗi và đếm số ký tự.