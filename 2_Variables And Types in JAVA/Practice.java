public class Practice {
    public static void main(String[] args) {

        /* int */
        int i = 10;
        System.out.println(i);

        /* double */
        double y = 11283471324.2434234234234;
        System.out.println(y); /* chuyen ve dang 1.128...E... */
        System.out.printf("%f\n", y); /* in full */

        /* float */
        float f = 1.22f; // phai co postfix 'f' vi so thuc mac dinh la double
        float f1 = (float) 1.23; // hoac ep kieu nhu nay
        System.out.printf("%.3f %.3f\n", f, f1);

        /* String */
        String str = "Trai Dep Vinh Phuc";
        System.out.println(str);

        /* long */
        long li = 239202945987l; // neu gia tri long vuot qua int max thi phai them postfix 'l'
        long li1 = 232142343424234234l;
        System.out.printf("%d %d\n", li, li1);

        int a = 1000000000, b = 1500000000;
        long c = (long) a + b;
        long d = 1l * a + b;
        System.out.printf("%d %d\n", c, d);

        /* bool */
        boolean bool = true;
        System.out.println(bool);

        /* char */
        char x = '1';
        System.out.println(x);

        final int q = 10; /* hang so */
        final String s = "Hung";
        System.out.println(q + " " + s);
    }
}