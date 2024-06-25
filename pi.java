import java.math.BigDecimal;
import java.math.MathContext;
import java.math.*;

public class pi
{
    public static void main(String[] args)
    {
        int k = 30;//Max I can get on Java
        BigDecimal half = new BigDecimal(1);
        for(int i=1;i<=k/2;i++){
          half=half.multiply(new BigDecimal(i));
        }
        BigDecimal tot = new BigDecimal(half.toBigInteger());
        for (int i = k/2+1; i<=k; ++i)
        {
            tot = tot.multiply(new BigDecimal(i));
        }
        BigDecimal denom = new BigDecimal(2<<k);
        denom = denom.multiply(half);
        denom = denom.multiply(half);
        BigDecimal num = new BigDecimal(Math.sqrt(k));
        num = num.multiply(tot);
        BigDecimal pi = denom.divide(num, MathContext.DECIMAL32);
        pi = pi.multiply(pi);
        pi = pi.divide(new BigDecimal (2));
        System.out.println(pi);
    }
}