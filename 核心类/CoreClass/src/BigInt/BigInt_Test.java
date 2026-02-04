package CoreClass.src.BigInt;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigInt_Test {
    public static void main(String[] args) {
        //
        BigInteger a = new BigInteger("123456789");
        BigInteger res = a.pow(2);
        System.out.println(res);

        BigInteger b  = new BigInteger("234567891");
        res = a.add(b);
        System.out.println(res);

        //基本类型转化
        // System.out.println(a.pow(5).longValueExact()); //超出范围报错BigInteger out of long range
        System.out.println(a.pow(5).floatValue());

        //
        BigDecimal aa =  new BigDecimal("3.141592657589290403");
        BigDecimal bb =  new BigDecimal("1.1415926575892932892348905");
        System.out.println(aa.add(bb));
        System.out.println(aa.divide(bb,10, RoundingMode.HALF_UP));
        BigDecimal[] r = aa.divideAndRemainder(bb);
        System.out.println(r[0]);      System.out.println(r[1]);

        //比较
        BigDecimal cc =  new BigDecimal("3.14159265758929040300");
        System.out.println(aa.equals(cc));
        System.out.println(aa.equals(cc.stripTrailingZeros()));
        System.out.println(aa.compareTo(cc));


    }
}
