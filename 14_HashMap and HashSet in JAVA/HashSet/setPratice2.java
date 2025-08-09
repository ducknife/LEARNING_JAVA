import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class setPratice2 {
    public static void main(String[] args){
        /* Ducknife */
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b  = new int[m];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }   
            for (int i = 0; i < m; i++){
                b[i] = sc.nextInt();
            }
            Set<Integer> se = new HashSet<>();
            TreeSet<Integer> Intersec = new TreeSet<>();
            TreeSet<Integer> Union = new TreeSet<>();
            TreeSet<Integer> Differ = new TreeSet<>();
            for (int x : a){
                se.add(x);
                Union.add(x);
            }
            for (int y : b){
                if (se.contains(y)){
                    Intersec.add(y);
                    se.remove(y);
                }
                else Union.add(y);
            }
            for (int x : se) Differ.add(x);
            Intersec.forEach((i) -> System.out.print(i + " "));
            System.out.println();
            Union.forEach((i) -> System.out.print(i + " "));
            System.out.println();
            Differ.forEach((i) -> System.out.print(i + " "));
        }
    }
}
