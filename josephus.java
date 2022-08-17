public class josephus {
    public static void main(String[] args) {
        int res=josue(5,5);
        System.out.println(res);

    }
    static int josue(int n, int m) {
        if(n==1 || m==1)

        {
            return 1;
        }
        return josue(n-1,m) + josue(n,m-1);



    }
}
