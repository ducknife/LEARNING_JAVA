import java.util.*;

public class __DemTanSuatKiTu {
    public static void main(String[] args) {
        String s1;
        try (Scanner sc = new Scanner(System.in)){
            s1 = sc.nextLine();
        }
        int[] cnt = new int[256];
        for (char x : s1.toCharArray()){
            cnt[x]++;
        }
        for (int i = 0; i < 256; i++){
            if (cnt[i] > 0){
                System.out.println((char)i + " " + cnt[i]);
            }
        }
    }
}
