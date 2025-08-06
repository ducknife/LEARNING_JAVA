import java.util.*;

public class ArrayMethods {
    public static void main(String[] args){
        // chỉ có thuộc tính length 

        int[] array = {1, 2, 3, 4};
        System.out.println(array.length);

        String[] array2 = new String[5];

        try (Scanner sc = new Scanner(System.in)){
            for (int i = 0; i < 5; i++){
                array2[i] = sc.next();
            }
        }

        for (String x : array2){
            System.out.println(x);
        }

        System.out.println(array2.length);

    }
}