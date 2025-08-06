import java.util.*;

public class sortInJavaPractice3 {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(), arr1 = new ArrayList<>(), arr2 = new ArrayList<>();
        int[] a = {1, 3, -1, 10, 10, 1, -1};
        for (int x : a){
            arr.add(x);
            arr1.add(x);
            arr2.add(x);
        }
        System.out.println("INITIAL ARRAY:");
        arr.forEach((item) -> System.out.print(item + " "));
        System.out.println("\n");

        System.out.println("SORT USE naturalOrder():");
        arr.sort(Comparator.naturalOrder());
        arr.forEach((item) -> System.out.print(item + " "));
        System.out.println("\n");

        System.out.println("SORT USE reverseOrder():");
        arr.sort(Comparator.reverseOrder());
        arr.forEach((item) -> System.out.print(item + " "));
        System.out.println("\n");

        System.out.println("SORT USE LAMBDA FUNCTION:");
        arr.sort((Integer x, Integer y) -> {
            return x - y;
        });
        arr.forEach((item) -> System.out.print(item + " "));
        System.out.println("\n");

        System.out.println("SORT USE COMPARING AND LAMBDA:");
        arr1.sort(Comparator.comparingInt((Integer i) -> i).reversed());
        arr1.forEach((item) -> System.out.print(item + " "));
        System.out.println("\n");

        System.out.println("SORT USE COMPARATOR OVERRIDE:");
        arr2.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b.compareTo(a);
            }
        });
        arr2.forEach((item) -> System.out.print(item + " "));
    }
}
