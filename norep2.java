import java.util.*;
public class norep2 {
    public static void main(String[] args) {
        int arr[]={2,1,5,2,3,1,5,3,7,9};
        int n=1;
        int res=0;
        for (int k : arr) {
            res = res ^ k;

        }
        while((res&n)==0)
        {
            n=n<<1;

        }
        List<Integer> a=new ArrayList<>();
        int temp=res;
        for (int j : arr) {
            if ((j & n) == 0) {
                temp = temp ^ j;


            }
        }
        System.out.println(temp);
        temp=temp^res;
        System.out.println(temp);


    }
}
