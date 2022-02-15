public class GCD2 {
    public static void main(String[] args) {
        int a=24;
        int b= 60;
        int gcd= gcd(a,b);
        System.out.println("GCD of "+a+" and "+b+" is "+gcd);

    }
    public static int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(a-b,b);
    }
}
