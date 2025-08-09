import java.util.Scanner;
import java.util.TreeSet;

public class locDanhSachEmail {
    public static void main(String[] args){
        /* Ducknife */
        try (Scanner sc = new Scanner(System.in)){
            TreeSet<String> se = new TreeSet<>();
            while (sc.hasNextLine()){
                String s = sc.nextLine();
                se.add(s);
            }
            se.forEach((i) -> System.out.println(i));
        }
    }
}
