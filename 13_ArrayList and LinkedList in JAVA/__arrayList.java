import java.util.*;

public class __arrayList {
    public static void main(String[] args){
        List<Integer> lst = new ArrayList<>(); // code theo interface. (Tuân thủ OOP).
        // phương thức add.
        lst.add(1);
        lst.add(2);
        lst.add(-1);
        ArrayList<Integer> arrayLst = new ArrayList<>(); // code theo implementation.
        arrayLst.add(1);
        arrayLst.add(-1);
        arrayLst.add(-10);
        arrayLst.add(1);
        for (int i : lst){
            System.out.println(i);
        }
        arrayLst.forEach((i) -> {
            System.out.println(i);
        });

        // phương thức remove.
        lst.remove(0); // xóa theo index.
        lst.remove(Integer.valueOf(1)); // xóa object có value 1 đầu tiên.

        // phương thức get. 
        System.out.println(lst.get(0)); // lấy giá trị theo chỉ số.

        // phương thức clear() và isEmpty()
        lst.clear(); // xóa toàn bộ.
        System.out.println(lst.isEmpty());
        System.out.println(arrayLst.contains(-10));

        // phương thức toArray();
        Object[] b = arrayLst.toArray(); // chuyển thành mảng các đối tượng.
        for (Object x : b){
            System.out.println(x);
        }

        // phương thức indexOf();
        System.out.println(arrayLst.indexOf(-10));

        // phương thức forEach();
        arrayLst.forEach((a) -> {
            System.out.println(a);
        });

        System.out.println(arrayLst.size());
    }
}