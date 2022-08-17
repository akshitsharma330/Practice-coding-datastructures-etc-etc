public class tiles {
    public static int calc(int n, int m){
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }

        return calc(n-m,m)+ calc(n-1,m);

    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(calc(n,m));

    }
    
}
