public class joseph {
    public static int josh(int n, int k){
        if(n==1){
            return 0;
        }
        return (josh(n-1,k)+k)%n;
    }
    public static void main(String[] args){
        System.out.println(josh(6,3));
    }
    
}
