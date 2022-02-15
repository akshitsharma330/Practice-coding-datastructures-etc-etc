public class fibonaci {
    public static void main(String[] args) {
        int a=10;
        fibo(a);

    }
    static void fibo(int a)
        {
            int first=0;
            int second=1;
            int res=0;
            for(int i=0;i<a;i++)
            {
                System.out.print(first + " ");
                res=first+second;
                first=second;
                second=res;


            }



        }


}
