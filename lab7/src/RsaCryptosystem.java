import java.math.BigInteger;    //В данной программе используется BigInteger. Он необходим для работы с большими числами. Просто смиритесь. Это лабы по инфе.

public class RsaCryptosystem {
    public static void main(String[] args) {
        int p = 43;
        int q = 61;
        BigInteger n = BigInteger.valueOf(p * q);  //Модуль
        int phi = (p - 1) * (q - 1);    //Функция Эйлера относительно n (2520)
        BigInteger e1 = findE(phi);     //Публичная экспонента
        BigInteger d1 = e1.modInverse(BigInteger.valueOf(phi));     //Просто пусть тут так будет. Это по формулам. Но для умного вида скажите, что это
        int e = e1.intValue();                                      //мультипликативно обратное число числу e по модулю phi. (e*d) mod phi == 1
        int d = d1.intValue();
        String encrMess = encDec("Hello, World", e, n);
        System.out.println(encrMess);
        String decrMess = encDec(encrMess, d, n);
        System.out.println(decrMess);
    }

    static String encDec(String message, int e, BigInteger n) {
        String encDecMess = "";
        for (int i = 0; i < message.length(); i++) {
            encDecMess += (char) BigInteger.valueOf(message.charAt(i)).pow(e).mod(n).intValue();
        }
        return encDecMess;
    }

    static BigInteger findE(int phi) {
        BigInteger currE = new BigInteger("2");
        for (int i = 3; i < phi; i++) {
            if (BigInteger.valueOf(i).gcd(BigInteger.valueOf(phi)).equals(BigInteger.ONE) && isPrime(i)) {
                currE = BigInteger.valueOf(i);
            }
        }
        return currE;
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
}
