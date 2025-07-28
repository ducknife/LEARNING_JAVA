import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            
            int[] arr; // declare an array
            arr = new int[N + 1]; // initialize an array

            // Scanning elements of array from keyboard
            for (int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++){
                System.out.printf("%d ", arr[i]);
            }

            System.out.printf("\n");

            int[] arr2 = {1, 2, 3, 4};
            for (int i = 0; i < 4; i++){
                System.out.printf("%d ", arr2[i]);
            }

            System.out.println("");

            arr2[1] = 0; // Change value of an element by index
            for (int x : arr2){
                System.out.printf("%d ", x);
            }
        }
    }
}