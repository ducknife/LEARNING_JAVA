import java.util.*;

public class DanhSachDoanhNghiep {
    public static String stdName(String s){
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split("[ ]+");
        for (String x : arr){
            sb.append(x.charAt(0));
            for (int j = 1; j < x.length(); j++){
                sb.append(x.charAt(j));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            List<DoanhNghiep> DNS = new ArrayList<>();
            for (int i = 0; i < n; i++){
                sc.nextLine();
                String id = sc.nextLine();
                String name = stdName(sc.nextLine());
                int qtt = sc.nextInt();
                DoanhNghiep dn = new DoanhNghiep(id, name, qtt);
                DNS.add(dn);
            }
            DNS.sort(Comparator.comparingInt((DoanhNghiep a) -> a.qtt).reversed()
            .thenComparing(a -> a.id));
            DNS.forEach((dn) -> dn.onScreen());
        }
    }
}

class DoanhNghiep {
    public String id;
    public String name; 
    public int qtt;
    DoanhNghiep(String id, String name, int qtt){
        this.id = id;
        this.name = name;
        this.qtt = qtt;
    }
    public void onScreen(){
        System.out.println(id + " " + name + " " + qtt);
    }
}
