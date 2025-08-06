
import java.util.*;

public class setPractice {
    public static void main(String[] args){
        int[] arr = {2, 1, 4, 6, 3, 1, 1, 1, 3, 5, 7};
        Set<Integer> se = new HashSet<>();
        Set<Integer> se1 = new LinkedHashSet<>();
        TreeSet<Integer> se2 = new TreeSet<>();
        for (int x : arr){
            se.add(x);
            se1.add(x); 
            se2.add(x);
        }
        System.out.println(se.size());
        System.out.println(se1.size());
        System.out.println(se2.size());

        se.forEach((i) -> System.out.print(i + " "));
        System.out.println();
        se1.forEach((i) -> System.out.print(i + " "));
        System.out.println();
        se2.forEach((i) -> System.out.print(i + " "));
        System.out.println();

        System.out.println(se2.first()); // 1
        System.out.println(se2.last()); // 7
        System.out.println(se2.ceiling(2)); // 2
        System.out.println(se2.floor(2)); // 2
        System.out.println(se2.lower(2)); // 1
        System.out.println(se2.higher(2)); // 3
    }
}
