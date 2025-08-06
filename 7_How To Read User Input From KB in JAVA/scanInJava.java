import java.util.*;

public class scanInJava {
    public static int add(int a, int b){ // hàm có static sẽ thuộc về lớp.
        return a + b;
    }
    public int sub(int a, int b){ // hàm không có static sẽ thuộc về đối tượng.
        return a - b; // nếu muốn dùng phải khai báo một đối tượng để dùng.
    }
    public static void print(String format, Object... values){
        System.out.printf(format, values);
    }
    public static void main(String[] args){

        // try-with-resources : không phải đóng scanner khi scan xong.
        try (Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt(); // Nhập số nguyên.
            int y = sc.nextInt();
            print("%d\n", add(x, y));

            long li = sc.nextLong();
            print("%d\n", li);

            scanInJava new_Obj = new scanInJava(); 
            print("%d\n", new_Obj.sub(x, y));

            sc.nextLine();
            // lưu ý, khi nhập xong một số nguyên ta cần sc.nextLine() trước để bỏ qua dấu enter của nhập số nguyên
            String s = sc.nextLine(); // Nhập xâu.
            print("%s\n", s);

            char c = sc.next().charAt(0); // Nhập 1 kí tự có thể dùng next(): hàm nhập xâu không có white-space,
            print("%c\n", c);              // rồi lấy kí tự vị trí 0.

            sc.nextLine(); // nhập 1 kí tự xong cũng cần nextLine() nếu sau đó dùng nextLine();
            char c2 = sc.nextLine().charAt(0);
            print("%c\n", c2);

            float f = sc.nextFloat();
            print("%.2f\n", f);

            double db = sc.nextDouble();
            print("%.2f\n", db);

            boolean b = sc.nextBoolean();
            print("%b\n", b);

            /* Nhập luồng trong java */
            try (Scanner sc1 = new Scanner(System.in)){
                while (sc1.hasNextLine()){ // khi còn dòng để nhập.
                    
                }
                while (sc1.hasNextInt()){

                }
                while (sc1.hasNextLine()){

                }
            }
        }
    }
}
