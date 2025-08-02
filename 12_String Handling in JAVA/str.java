import java.util.Scanner;
/* String là 1 wrapper class */
public class str {
    public static void main(String[] args){
        // String pool trong JAVA.
        String s = "12323"; // s được khởi tạo như này sẽ lưu vào String pool - một vùng riêng trong heap.
        System.out.println(s);
        
        // s1 nằm trong heap, không thuộc string pool.
        String s1;
        try (Scanner sc = new Scanner(System.in)){
            s1 = sc.next();
        }
    
        // String s2 = new String("12323"); -> khai báo như này cũng không trong String pool mà trong heap.
        // System.out.println(s2);
        
        System.out.println(s.equals(s1)); /* true */
        // System.out.println(s == s1) /* false */

        System.out.println(s.charAt(0)); 
        System.out.println(s.startsWith("H")); // trả về bool.
        System.out.println(s.endsWith("3")); // trả về bool.

        System.out.println(s.length());

        String s2 = "absfsf";
        System.out.println(s2.toUpperCase());
        String s3 = "ABSFSF";
        System.out.println(s3.toLowerCase());
        System.out.println(s2.compareToIgnoreCase(s3)); // so sánh bỏ qua in hoa, thường.
        System.out.println(s2.substring(1, 3)); // bs : không lấy endindex.
        char[] arrChars = s2.toCharArray(); // chuyển string thành mảng kí tự.
        for (char c : arrChars){
            System.out.println(c);
        }
    }
}