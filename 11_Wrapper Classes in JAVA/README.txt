Wrapper Class trong Java
========================

1. Giới thiệu
-------------
- Wrapper Class là các lớp bao cho kiểu dữ liệu nguyên thủy (int, double, char, …) để biến chúng thành đối tượng (object).
- Cần thiết khi:
  + Làm việc với Collections (ArrayList, HashMap, …) vì chúng không hỗ trợ primitive.
  + Dùng các method tiện ích (chuyển đổi kiểu, so sánh, parse từ String, …).
  + Sử dụng Generics (chỉ nhận object).

2. Các hàm & cú pháp phổ biến
------------------------------
Bảng Wrapper Class:
  byte     -> Byte
  short    -> Short
  int      -> Integer
  long     -> Long
  float    -> Float
  double   -> Double
  char     -> Character
  boolean  -> Boolean

Ví dụ:
  // Autoboxing & Unboxing
  Integer a = 10;      // Autoboxing: int -> Integer : tự động chuyển primitive -> object
  int b = a;           // Unboxing: Integer -> int : tự động chuyển object thành primitive

  // Chuyển String thành số
  int num = Integer.parseInt("123"); // trả về primitive
  double pi = Double.parseDouble("3.14"); // trả về primitive 

  // Chuyển số thành String
  String s1 = Integer.toString(456); // trả về object;
  String s2 = String.valueOf(789); // trá về object;

  // Lấy hằng số
  System.out.println(Integer.MAX_VALUE); // 2147483647
  System.out.println(Double.MIN_VALUE);

  // So sánh
  Integer x = 5, y = 10;
  System.out.println(x.equals(y));       // false
  System.out.println(x.compareTo(y));    // -1 (x < y), 0 (x = y), 1 (x > y)

  // Lấy giá trị primitive từ object
  double d = x.doubleValue(); // không hay dùng vì đã có autounboxing;
  int i = x.intValue();

3. Thư viện cần import
-----------------------
- Các Wrapper Class nằm trong java.lang, không cần import.
- Nếu dùng với Collections:
  import java.util.ArrayList;
  import java.util.Collections;

4. Bài tập thực hành
---------------------
Ví dụ 1: Autoboxing và chuyển đổi
  public class Main {
      public static void main(String[] args) {
          Integer a = 100;
          int b = a + 50;
          System.out.println("Kết quả: " + b);

          String numStr = "42";
          int num = Integer.parseInt(numStr);
          System.out.println("Chuỗi thành số: " + num);
      }
  }

Ví dụ 2: Dùng Wrapper với ArrayList
  import java.util.ArrayList;
  import java.util.Collections;

  public class Main {
      public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(5);
          list.add(2);
          list.add(8);
          Collections.sort(list);
          System.out.println(list); // [2, 5, 8]
      }
  }

Bài tập tự làm:
- Đọc mảng chuỗi số ({"12", "7", "45"}),
- Chuyển thành ArrayList<Integer>,
- Tìm giá trị lớn nhất, nhỏ nhất,
- In ra tổng các số.

5. Ghi chú kiến thức quan trọng (kể cả nâng cao)
------------------------------------------------
1. Autoboxing/unboxing giúp code gọn hơn khi làm việc với Collections.
2. parseInt() trả về primitive, valueOf() trả về Wrapper object.
3. Wrapper class là immutable (không thể thay đổi giá trị bên trong).
4. So sánh Wrapper nên dùng equals() hoặc compareTo() thay vì ==.
5. Với số lớn hoặc cần chính xác tuyệt đối, dùng BigInteger và BigDecimal (java.math).


????????????????????????????????????///???????????????
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

