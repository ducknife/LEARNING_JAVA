
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class __LocEmailTrung {
    public static void main(String[] args){
        String s1;
        ArrayList<Email> arrS = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)){
            while (sc.hasNextLine()){
                s1 = sc.nextLine();
                boolean check = false;
                for (Email x : arrS){
                    if (x.email.equals(s1)){
                        check = true;
                        x.fre++;
                        break;
                    }
                }
                if (!check){
                    Email x = new Email(s1, 1);
                    arrS.add(x);
                }
            }
        }
        for (Email x : arrS){
            System.out.println(x.email + " " + x.fre);
        }
        arrS.sort(Comparator.comparingInt((Email e) -> e.fre).reversed()
                            .thenComparing(e -> e.email));
        for (Email x : arrS){
            System.out.println(x.email + " " + x.fre);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-1);
        arr.add(2);
        arr.sort(
            Comparator.reverseOrder()
        );
        for (int x : arr){
            System.out.println(x);
        }
    }
}

class Email {
    public String email;
    public int fre;
    Email (String email, int fre){
        this.email = email;
        this.fre = fre;
    }
}