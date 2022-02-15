public class mod {
    public static void main(String[] args) {
        int res=fastpower(3,5);
        System.out.println(res);

    }
    static int fastpower(int a, int b){
        int res= 1;
        while(b>0){
            if((b&1)!=0){
                res= res*a;
            }
            a=a*a;
            b=b>>1;
        }
        return res;
    }
}
