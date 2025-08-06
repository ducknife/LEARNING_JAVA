
import java.util.*;

public class ChieuPhim3 {
    public static void main(String[] args){
        List<Phim> Phims = new ArrayList<>();
        List<TheLoaiPhim> TLP = new ArrayList<>();
        int n, m;
        try (Scanner sc = new Scanner(System.in)){
            n = sc.nextInt();
            m = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= n; i++){
                TheLoaiPhim x = new TheLoaiPhim();
                String name = sc.nextLine();
                String id;
                if (i < 10){
                    id = "TL00" + String.valueOf(i);
                }
                else if (i < 100){
                    id = "TL0" + String.valueOf(i);
                }
                else {
                    id = "TL" + String.valueOf(i);
                }
                x.name = name;
                x.id = id;
                TLP.add(x);
            }
            for (int i = 1; i <= m; i++){
                String tlp = sc.nextLine();
                int idx = Integer.parseInt(tlp.substring(2, 5));
                String type = TLP.get(idx - 1).name;
                String date = sc.nextLine();
                String name = sc.nextLine();
                int episode = sc.nextInt();
                String id;
                if (i < 10){
                    id = "P00" + String.valueOf(i);
                }
                else if (i < 100){
                    id = "P0" + String.valueOf(i);
                }
                else {
                    id = "P" + String.valueOf(i);
                }
                sc.nextLine();
                Phim x = new Phim(type, id, date, name, episode);
                Phims.add(x);
            }
            Phims.sort(Comparator.comparing((Phim a) -> a.date.substring(6, 10))
            .thenComparing(a -> a.date.substring(3, 5))
            .thenComparing(a -> a.date.substring(0, 2))
            .thenComparing(a -> a.name)
            .thenComparing(Comparator.comparingInt((Phim a) -> a.episode).reversed()));
            Phims.forEach((Phim x) -> {
                System.out.println(x.id + " " + x.type + " " + x.date + " " + x.name + " " + x.episode);
            });
        }
    }
}

class Phim {
    public String type, id, date, name;
    public int episode;
    Phim (String type, String id, String date, String name, int episode){
        this.type = type;
        this.id = id;
        this.date = date;
        this.name = name;
        this.episode = episode;
    }
}

class TheLoaiPhim {
    public String id;
    public String name;
}