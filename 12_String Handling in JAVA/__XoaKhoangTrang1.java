import java.util.StringTokenizer;

public class __XoaKhoangTrang1 {
    public static void main(String[] args) {
        /* Xóa kí tự không mong muốn trong xâu */

        /* Cách 1: Dùng split()
         * split() tách các ra các xâu con dựa trên regex (regular expression: biểu thức chính quy);
         * Bạn cần truyền biểu thức bọc bởi dấu nháy kép vào split();
         * Regex chứa \s (dấu cách), \S : ký tự không phải khoảng trắng tương đương [ ^\f\n\r\t\v],...
         * Khá khó nhớ mấy cái này nên đơn giản bạn muốn tách bởi kí tự nào thì cứ gõ bằng bàn phím. 
         * (áp dụng phạm vi nhỏ, lớn hơn thì nên làm theo chuyên gia thứ 10 khuyên dùng).
         * Ví dụ: " /&^%"
         * Nếu xâu có nhiều hơn 1 kí tự kiểu này thì bạn cho vào ngoặc vuông và thêm dấu + ở cuối.
         * Ví dụ: "[/&^%]+"
         */
        String s = "  Nguyen  ?   Van   ./&*%%%%%   Hung   ";
        String b = "";
        String[] ac = s.trim().split("[ ?./*&^%]+");
        for (String x : ac){
            b += x + " ";
        }
        System.out.println(b); 


        /* Cách 2: Dùng StringTokenizer */
        String a = "";
        StringTokenizer st = new StringTokenizer(s, "? ./"); // truyền vào đây xâu cần tách và các kí tự muốn tách bỏ, 
                                                                   // tách được nhiều
        while (st.hasMoreTokens()){ // còn từ để lấy
            a += st.nextToken() + " "; // lấy nó ra 
        }
        System.out.println(a);
    }
}
