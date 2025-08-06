import java.util.*;

class SinhVien {
    public double gpa;
    public String name;
    public String id;
    public String birthOfDate;
    SinhVien(double gpa, String name, String id, String birthOfDate) {
        this.gpa = gpa;
        this.name = name;
        this.id = id;
        this.birthOfDate = birthOfDate;
    }
    public void onScreen(){
        System.out.printf("%s %s %s %.2f\n", id, name, birthOfDate, gpa);
    }
}

public class sortPractice2 {
    public static String stdName(String s){
        StringBuilder sb = new StringBuilder();
        String[] arrs = s.trim().split("[ ]+");
        for (String x : arrs){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public static void main(String[] args){
        List<SinhVien> sv = new ArrayList<>();
        SinhVien x = new SinhVien(4.000, stdName("   Nguyen Van   Hung  "), "B23DCCN360", "12/06/2005");
        SinhVien y = new SinhVien(4.00, stdName("Nguyen Van   Hung   "), "B23DCCN126", "12/05/2005");
        sv.add(x);
        sv.add(y);
        sv.sort(Comparator.comparing((SinhVien a) -> a.gpa).reversed()
        .thenComparing(a -> a.name)
        .thenComparing(Comparator.comparing((SinhVien a) -> a.id).reversed()));
        sv.forEach((p) -> p.onScreen());
    }
}
