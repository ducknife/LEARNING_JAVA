
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args){
        
        int[][] array2d = new int[6][6];

        try (Scanner sc = new Scanner(System.in)){
            for (int i = 0; i < 6; i++){
                for (int j = 0; j < 6; j++){
                    array2d[i][j] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                System.out.printf("%d ", array2d[i][j]);
            }
            System.out.println("");
        }
    }
}
