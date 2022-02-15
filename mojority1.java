public class mojority1 {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,1,3,2,1,1,2,2,2};
        int max=0;
        int maxval=0;
        for(int i=0;i<arr.length;i++)
        {
            int temp=0;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    temp++;

                }
            }
            if(temp>max)
            {
                max=temp;
                maxval=arr[i];
            }

        }
        System.out.println(maxval);
    }
}
