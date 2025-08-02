import java.util.Scanner;

public class wrapperClass {
    static int x; 
    static Integer y;
    public static void main(String[] args){
        System.out.println(x + " " + y); /* 0 null */
        
        // autoboxing: tự động cuốn vào lớp
        // unboxing: lấy ra primitive từ lớp
        
        Integer a = 10; // int 10 -> Integer
        int b = a; // Integer -> int
        System.out.println(a + " " + b);

        // String to Number
        
        int i = Integer.parseInt("123");
        double d = Double.parseDouble("123.234");
        float f = Float.parseFloat("123.3123");
        System.out.println(i + " " + d + " " + f);
        
        // int i2 = Integer.valueOf("123"); cũng được mà không nên dùng vì tốn thêm bước unboxing.
        int i2 = Integer.parseInt("22");
        System.out.println(i2);

        // Number to String
        String H = Double.toString(123.34);
        String H2 = Integer.toString(23123);
        String H3 = Float.toString(123.23f);
        String H8 = Character.toString('a');

        String H4 = String.valueOf(123);
        String H5 = String.valueOf(123.123);
        String H6 = String.valueOf(123.213f);
        String H7 = String.valueOf('a');
        System.out.println(H + "\n" + H2 + "\n" + H3 + "\n" + H8 + "\n" + H4 + "\n" + H5 + "\n" + H6 + "\n" + H7); 

        // Get const number
        System.out.println(Integer.MAX_VALUE);
        System.out.printf("%f\n", Double.MAX_VALUE);
        System.out.printf("%f\n", Float.MIN_VALUE);

        // So sánh 2 wrapper: cần dùng equals() hoặc compareTo();
        String s1 = "123";
        String s2;
        try (Scanner sc = new Scanner(System.in)){
            s2 = sc.nextLine();
        }
        System.out.println(s1.equals(s2)); // true;
        System.out.println(s1.compareTo(s2)); // -1 if s1 < s2, 0 if s1 = s2, 1 if s1 > s2;
    }
}

/* luu y: 1. String khong co wrapper vi no la 1 class
 * 2. primitive mac dinh la 0, con wrapper class co gia tri la null (vi no la 1 Object)
 */