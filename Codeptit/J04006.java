import java.util.Scanner;

public class J04006 {
    public static String std(String s){
        String[] parts = s.split("[/]");
        if (parts[0].length() == 1) parts[0] = "0" + parts[0];
        if (parts[1].length() == 1) parts[1] = "0" + parts[1];
        return parts[0] + "/" + parts[1] + "/" + parts[2];
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            String name = sc.nextLine();
            String cls = sc.nextLine();
            String birth = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien x = new SinhVien(name, cls, birth, gpa);
            System.out.print("B20DCCN001 " + x.name + " " + x.cls + " " + std(x.birth) + " ");
            System.out.printf("%.2f", x.gpa);
        }
    }
}

class SinhVien {
    public String name, cls, birth;
    public double gpa;
    SinhVien (String name, String cls, String birth, double gpa){
        this.name = name;
        this.cls = cls;
        this.birth = birth;
        this.gpa = gpa;
    }
}