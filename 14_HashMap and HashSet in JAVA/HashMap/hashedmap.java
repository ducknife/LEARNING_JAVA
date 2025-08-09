import java.util.HashMap;
import java.util.Map;


public class hashedmap {
    public static void main(String[] args){
        /* Ducknife */
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 1);
        mp.put(2, 2);
        System.out.println(mp.size());

        // duyệt map không kiểm tra điều kiện hay ...
        mp.forEach((key, value) -> System.out.println(key + " " + value));

        // duyệt map có kiểm tra hay ... dùng entrySet
        for (Map.Entry<Integer, Integer> et : mp.entrySet()){
            if (et.getValue() >= 2) System.out.println(et.getKey() + " " + et.getValue());
        }

        // duyệt dùng key 
        for (Integer key : mp.keySet()){
            System.out.println(key + " " + mp.get(key));
        }

        // duyệt các giá trị 
        for (Integer value : mp.values()){
            System.out.println(value);
        }
        
        System.out.println(mp.get(2));
        System.out.println(mp.get(1));
        for (Map.Entry<Integer, Integer> et : mp.entrySet()){
            System.out.println(et.getKey() + " " + et.getValue());
        }
        
        System.out.println("Duyet map");
        for (Map.Entry<Integer, Integer> et : mp.entrySet()){
            System.out.println(et.getKey() + " " + et.getValue());
        }

        mp.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
