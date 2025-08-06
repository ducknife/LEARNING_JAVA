
import java.util.*;

public class ArraySort {
    public static void main(String[] args){
        Integer[] arr = {1, 2, 4, 1, 2, 3, 4};
        Arrays.sort(arr, Comparator.reverseOrder());

        int[] arr1 = {1, 2, 4, 2};
        Arrays.sort(arr1);

        Arrays.sort(arr, Comparator.comparing((p) -> p));

        for (int x : arr){
            System.out.println(x);
        }

        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b - a;
            }
        });

        for (int x : arr){
            System.out.println(x);
        }

        Arrays.sort(arr, (b, a) -> {return b - a;});
        for (int x : arr){
            System.out.println(x);
        }
    }
}