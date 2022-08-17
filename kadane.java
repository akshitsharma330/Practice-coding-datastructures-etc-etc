import javax.sound.sampled.SourceDataLine;

public class kadane {
    public static void main(String[] args)
    {
        int arr[]={5,-4,-2,6,-1};
        int maxsum=0;
        int curr=0;
        int si=0;
        int ei=0;

        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>maxsum){
                maxsum=curr;
                ei=i;
            }
            if(curr<=0){
                si=i+1;
                curr=0;
            }
        }
        System.out.println(maxsum);
        System.out.println(si);
        System.out.println(ei);
    }
    
}
