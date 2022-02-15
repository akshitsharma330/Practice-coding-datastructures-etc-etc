import java.util.Arrays;
public class majority2 {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,4,5,4,3,2,3,2,1,1,2,1,2,8,1,};
        Arrays.sort(arr);
        int max=0;
        int maxval=0;
        int temp=1;
        int curr=arr[0];
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        for(int i=0;i<arr.length-1;i++)
        {
//            System.out.println("inside for ");

            if(arr[i]==arr[i+1])
            {
//                System.out.println("inside if ");
                temp=temp+1;
            }
            else {
//                System.out.println("inside else ");
                if(max<temp)
                {
                    max=temp;
                    maxval=arr[i];

                }
                temp = 1;
            }

        }
        System.out.println( max+"    " + maxval);

    }
}
