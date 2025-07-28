public class Practice {

    public static void print(String format, Object... values){
        System.out.printf(format, values);
    }
    public static void main(String[] args) {
        System.out.println("Hello PTIT.");
        System.out.print("Hello, Ducknife.\n");
        System.out.printf("Hello, World.\n");
        print("%s %d", "This is so peak, bruh", 20);
    }
}