import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args){
        String x = "10";
        String y;
        try (Scanner sc = new Scanner(System.in)){
            y = sc.next();
        }
        // System.out.println(x == y); 
        System.out.println(x.equals(y));

        System.out.println(Integer.MAX_VALUE);
        int z = Integer.parseInt("120");
        System.out.println(z);

        String s = Integer.toString(120);
        System.out.println(s);

        String t = String.valueOf(120);
        System.out.println(t);

        System.out.println(t.equals(s));
    }
}
