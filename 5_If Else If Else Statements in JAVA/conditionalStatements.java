public class conditionalStatements {
    public static void print(String format, Object... values){
        System.out.printf(format, values);
    }
    public static void main(String[] args) {
        int a = 10, b = 20;
        String x = a < b ? "haha" : "hihi";
        print("%s\n", x);

        boolean y = a < b;
        print("%b\n", y);

        if (a < b){
            print("%s\n", "a < b");
        }
        else {
            print("%s\n", "a > b");
        }

        if (a < b && y == true){
            print("%s", "TRUE");
        } 
        else {
            print("%s", "FALSE");
        }
    }
}