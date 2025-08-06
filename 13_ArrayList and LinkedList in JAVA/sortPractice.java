
import java.util.*;

public class sortPractice {
    public static void main(String[] args){
        List<String> as = new ArrayList<>();
        as.add("hello");
        as.add("hihi");
        as.add("hello");
        as.sort((String a, String b) -> {
            return a.compareTo(b);
        });
        for (String x : as){
            System.out.println(x);
        }

        as.sort(Comparator.comparing((String a) -> a).reversed());
        as.forEach((item) -> System.out.println(item));

        as.sort(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });
        as.forEach((str) -> System.out.println(str));
    }
}
