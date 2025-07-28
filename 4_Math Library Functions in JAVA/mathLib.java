
public class mathLib {
    public static void print(String format, Object... values){
        System.out.printf(format, values);
    }
    public static void main(String[] args){
        int a = 16;
        int x = (int) Math.sqrt(a);
        System.out.println(x);
        int y = (int) Math.abs(a);
        System.out.println(y);

        float b = 1.12323f;
        int z = (int) Math.ceil(b);
        print("%d\n", z);

        print("%d\n", Math.max(10, 20));
        print("%d\n", Math.min(10, 20));

        int t = (int) Math.floor(b);
        print("%d\n", t);

        print("%.15f\n", Math.PI);

        print("%.15f", Math.E);
    }
}