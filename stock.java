import javax.sound.sampled.SourceDataLine;

public class stock {
    public static void main(String[] args){
        int arr[]= {5,2,6,1,4};
        int maxSoFar=0;
        int si=0;
        int ei=0;
        int curr=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                if((arr[j]-arr[i])>maxSoFar){
                    maxSoFar=arr[j]-arr[i];
                    si=i;
                    ei=j;
                }

            }

            
        }
        System.out.println(maxSoFar);
        System.out.println(si);
        System.out.println(ei);
    }
    
}
