public class kadane {
    public static void main(String[] args)
    {
        int arr[]={5,-4,-2,7,-1};
        int maxsum=0;
        int curr=0;

        for(int i=0;i<arr.length; i++)
        {
            curr+=arr[i];
            if(curr>maxsum)
            {
                maxsum=curr;
            }
            if (curr < 0) {
                curr=0;
            }
        }
        System.out.println(curr);
    }
}
