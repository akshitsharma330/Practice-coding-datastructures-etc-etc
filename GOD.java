public class GOD {
    public static void main(String[] args) {
        int res=jos(6,3);
        System.out.println(res);
    }
    static int jos(int n,int m) {
        if (n == 1) {
            return 0;

        }
        return(jos(n-1,m)+m)%n;
    }

}
