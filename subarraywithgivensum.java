import java.util.HashMap;
public class subarraywithgivensum {
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sum=12;
        int currsum=0;
        int end=-1;
        int start=0;

        for(int i=0; i<arr.length; i++){

            currsum+=arr[i];
            if(currsum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currsum-sum)){
                start=map.get(currsum-sum)+1;
                end=i;
            }
            map.put(currsum,i);
        

        }
        if(end==-1){
            System.out.println("No subarray of given sum found");

        }else{
            System.out.println("Subarray from "+start+" to "+end+" found");
        }
    }
    
}
