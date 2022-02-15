public class fiborecc {
    public static void main(String[] args) {
        int a=10;
        fibo(0, 1,a);

    }
    static void fibo(int f, int s, int a) {
        if(a==0) {
            return;
        }
        System.out.println(f);
        fibo(s,f+s,a-1);
    }
}
