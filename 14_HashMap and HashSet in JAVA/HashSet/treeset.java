
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args){

        /* treeset có thứ tự mặc định tăng, tốc độ tìm kiếm, xóa, các hàm logN */
        TreeSet<Integer> se = new TreeSet<>(/* custom comparator here */);
        se.add(1);
        se.add(-1);
        se.add(10);
        se.forEach((i) -> System.out.println(i));

        System.out.println(se.first());
        System.out.println(se.last());
        System.out.println(se.floor(2)); /* lớn nhất <= x, null nếu không có */
        System.out.println(se.ceiling(2)); /* nhỏ nhất >= x, null nếu không có */
        System.out.println(se.lower(2)); /* lớn nhất nhỏ hơn x, null nếu không có */
        System.out.println(se.higher(2)); /* nhỏ nhất lớn hơn x, null nếu không có */
    }
}
