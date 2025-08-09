
import java.util.*;

public class ChieuPhim2 {
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
            Phims.sort((Phim a, Phim b) -> {
                String da = a.date.substring(6, 10);
                String db = b.date.substring(6, 10);
                if (da.equals(db)){
                    String ma = a.date.substring(3, 5);
                    String mb = b.date.substring(3, 5);
                    if (ma.equals(mb)){
                        String dat = a.date.substring(0, 2);
                        String dbt = b.date.substring(0, 2);
                        if (dat.equals(dbt)){
                            if (a.name.equals(b.name)){
                                return b.episode - a.episode;
                            }
                            else return a.name.compareTo(b.name);
                        }
                        else return dat.compareTo(dbt);
                    }
                    else return ma.compareTo(mb);
                }
                else return da.compareTo(db);
            });
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
