

public class Practice01 {
    public static void main(String[] args){
        Integer x = 10;
        int y = x;
        System.out.println(x + " " + y);

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("123.123");
        float c = Float.parseFloat("123.123");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String s1 = Integer.toString(123);
        String s2 = Float.toString(123.123f);
        String s3 = Double.toString(123.123);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = String.valueOf(123);
        String s5 = String.valueOf(123.123f);
        String s6 = String.valueOf(123.123);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        System.out.println(s2.equals(s3));
        System.out.println(s2.compareTo(s3));

        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);
    }
}
