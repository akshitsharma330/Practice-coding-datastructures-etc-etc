public class sum_subarray {
    public static void main(String[] aargs){
        int arr[]={-5,4,6,-3,4,-1};
        int maxsum=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            int temp=0;
            for(int j=i;j<arr.length;j++)
            {
                temp=temp+arr[j];
                if(maxsum<temp)
                {
                    maxsum=temp;
                    start=i;
                    end=j;
                }

            }
        }
        System.out.println("maxsum is:"+ maxsum + "from "+ start + " to "+ end);


    }

}
