

Toán học trong Java (java.lang.Math & java.math)
=================================================

1. java.lang.Math
------------------
- Nằm trong package java.lang (không cần import).
- Cung cấp các hàm toán học cơ bản cho kiểu nguyên thủy (int, double, float...).
- Tất cả method là static.

Ví dụ các method phổ biến:
  Math.sqrt(16)      // 4.0 (căn bậc 2)
  Math.pow(2, 3)     // 8.0 (lũy thừa)
  Math.abs(-5)       // 5 (giá trị tuyệt đối)
  Math.max(3, 7)     // 7 (tìm max)
  Math.random()      // số ngẫu nhiên [0.0, 1.0)
  Math.round(3.6)    // 4 (làm tròn)

Lưu ý: Chỉ dùng cho kiểu primitive và double/float, không chính xác tuyệt đối cho số lớn.

2. java.math.BigInteger
------------------------
- Dùng cho số nguyên rất lớn (vượt quá giới hạn long).
- Immutable (mọi phép toán tạo object mới).
- Cần import: import java.math.BigInteger;

Khởi tạo:
  BigInteger a = new BigInteger("123456789012345678901234567890");
  BigInteger b = BigInteger.valueOf(1000); // từ long

Các phép toán (không dùng +, -, *, / mà dùng method):
  BigInteger sum = a.add(b);
  BigInteger diff = a.subtract(b);
  BigInteger product = a.multiply(b);
  BigInteger quotient = a.divide(b);
  BigInteger mod = a.mod(b);

3. java.math.BigDecimal
------------------------
- Dùng cho số thập phân chính xác tuyệt đối (không bị sai số như double).
- Rất quan trọng trong tính toán tài chính, ngân hàng.
- Immutable.
- Cần import: import java.math.BigDecimal;

Khởi tạo:
  BigDecimal price = new BigDecimal("19.99");
  BigDecimal tax = new BigDecimal("0.05");

Các phép toán:
  BigDecimal total = price.add(tax);
  BigDecimal discount = price.multiply(new BigDecimal("0.9"));
  BigDecimal rounded = price.setScale(2, BigDecimal.ROUND_HALF_UP); // làm tròn

4. Khi nào dùng?
----------------
- BigInteger: số nguyên rất lớn (mật mã, thuật toán số học).
- BigDecimal: xử lý tiền tệ, tài chính, cần chính xác tuyệt đối.
- Lưu ý: Chậm hơn nhiều so với kiểu nguyên thủy.

5. Bài tập thực hành
---------------------
Ví dụ 1: Tính giai thừa lớn với BigInteger
  import java.math.BigInteger;

  public class Main {
      public static void main(String[] args) {
          BigInteger fact = BigInteger.ONE;
          for (int i = 1; i <= 100; i++) {
              fact = fact.multiply(BigInteger.valueOf(i));
          }
          System.out.println("100! = " + fact);
      }
  }

Ví dụ 2: Tính tổng tiền với BigDecimal (chính xác tuyệt đối)
  import java.math.BigDecimal;

  public class Main {
      public static void main(String[] args) {
          BigDecimal price = new BigDecimal("19.99");
          BigDecimal tax = new BigDecimal("0.05");
          BigDecimal total = price.add(tax);
          System.out.println("Tổng cộng: " + total);
      }
  }

Bài tập tự làm:
1. Viết chương trình tính lãi kép cho một khoản tiền ban đầu (dùng BigDecimal).
2. Viết chương trình cộng dồn một danh sách số nguyên cực lớn (dùng BigInteger).
3. Tìm số nguyên tố lớn hơn 10^50 (gợi ý: BigInteger.isProbablePrime()).

6. Ghi chú quan trọng
----------------------
1. BigInteger và BigDecimal là immutable: mọi phép toán tạo object mới.
2. Không dùng toán tử +, -, *, / mà phải dùng method add(), subtract(), multiply(), divide().
3. BigDecimal tránh sai số khi xử lý số thập phân (khác với double).
4. BigInteger không giới hạn kích thước (giới hạn bởi RAM).
5. Hiệu suất chậm hơn kiểu nguyên thủy, chỉ dùng khi cần.

