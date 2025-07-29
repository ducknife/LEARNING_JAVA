import java.util.*;

public class enhancedForLoop {
    // or forEach
    
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 8};
        for (int x : arr){
            System.out.println(x);
        }
        int[] arr2 = new int[10];
        try (Scanner sc = new Scanner(System.in)){
            for (int i = 0; i < 10; i++){
                arr2[i] = sc.nextInt();
            }
        }
        for (int x : arr2){
            System.out.printf("%d ", x);
        }
    }
}
