import java.util.*;

public class linkedhashset {
    public static void main(String[] args){
        Set<Integer> se = new LinkedHashSet<>(); /* thứ tự là thứ tự thêm vào, tìm kiếm, xóa,;;; O(1) */

        se.add(1);
        se.add(-1);
        se.add(10);
        se.forEach((i) -> System.out.println(i));
    }
}
