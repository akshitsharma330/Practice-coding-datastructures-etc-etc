import java.util.Arrays;

public class primenosieve {
    public static void main(String[] args) {
        boolean n[] = seiveOfEratoSthenes(20);
        for (int i = 0; i < n.length; i++) {
            System.out.println(i + " " + n[i]);
        }


    }

    public static boolean[] seiveOfEratoSthenes(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = (i<<1); j <= n; j += i) {
                isPrime[j] = false;
            }
        }


        return isPrime;

    }


}

