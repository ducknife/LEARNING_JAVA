import java.math.BigInteger;

public class XuLiSoLon {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("123123123123123123");
        BigInteger b = new BigInteger("123123123123123123123123123");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
