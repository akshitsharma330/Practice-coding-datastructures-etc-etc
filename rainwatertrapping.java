import java.util.*;
public class rainwatertrapping {
    public static void main(String[] args) {
        int[] list= {3,1,2,4,0,1,3,2};

        int[] left=new int[list.length];
        int[] Right=new int[list.length];
        
        //code for left aux array
        left[0]=list[0];
        Right[list.length-1]=list[list.length-1];
        int total=0;
        for (int i=1; i<list.length; i++) {
            if(list[i]>left[i-1]){
                left[i]=list[i];
                
            }else{
                left[i]=left[i-1];
            }
        }
        for(int i=list.length-2;i>=0;i--){
            if(list[i]>Right[i+1]){
                Right[i]=list[i];
            }else{
                Right[i]=Right[i+1];
            }
        }
        for(int i=0;i<list.length;i++){
            total+=Math.min(left[i],Right[i]) -list[i];
            
        }
        System.out.println(total);

    }
    
}
