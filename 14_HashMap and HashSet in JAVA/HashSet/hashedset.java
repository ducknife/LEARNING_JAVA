
import java.util.*;


public class hashedset {
    public static void main(String[] args){
        Set<Integer> se = new HashSet<>(); /* không có thứ tự, tìm kiếm, xóa, ... O(1) */
        se.add(1);
        se.add(1);
        se.add(-1);
        se.add(-1);
        System.out.println(se.size());

        se.remove(1);
        System.out.println(se.contains(1)); /* false */

        se.forEach((i) -> System.out.println(i));

        se.clear();

        System.out.println(se.isEmpty());

    }
}