public class invitation {
    public static int invite(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return invite(n-1)+(n-1)*invite(n-2);
    }
    public static void main(String[] args){
        System.out.println(invite(4));
    }
    
}
