import java.util.*;
public class powersetofnatural{
    public static void calc(int n,ArrayList<Integer> subset){
        if(n==0){
            System.out.println("");
            for(Integer ele:subset){
                System.out.print(ele);
            }
            return;
            
            
        }
        subset.add(n);
        calc(n-1, subset);
        subset.remove(subset.size()-1);
        calc(n-1,subset);

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<Integer>();
        calc(n, subset);
        
    }

}