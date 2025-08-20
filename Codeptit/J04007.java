import java.util.Scanner;

public class J04007 {
    public static void main(String[] args){
        /* Ducknife */
        try (Scanner sc = new Scanner(System.in)){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String birth = sc.nextLine();
            String address = sc.nextLine();
            String tax = sc.nextLine();
            String date = sc.nextLine();
            System.out.println("00001 " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + date);
        }
    }
}
