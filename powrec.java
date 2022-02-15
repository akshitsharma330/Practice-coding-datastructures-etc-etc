public class powrec {
    public static void main(String[] args) {
        int a=10;
        int b=4;
        int res=pow(a,b);
        System.out.println(res);
    }
    static int pow(int a, int b)
    {
        if(b==0)
            return 1;
        else
            return a*pow(a,b-1);
    }

}
