public class mergesort {
    public static void merge(int[] arr, int start, int mid, int end){
        int[] merged=new int[end-start+1];
        int i= start;
        int j= mid+1;
        int x=0;
        for(;i<=mid&&j<=end;){
            if(arr[i]<arr[j]){
                merged[x++]=arr[i++];

            }else{
                merged[x++]=arr[j++];
            }
        }
        while(i<=mid){
            merged[x++]=arr[i++];
        }
        while(j<=end){
            merged[x++]=arr[j++];
        }
        for(x=0,i=start;x<merged.length;x++,i++){
            arr[i]=merged[x];

        }


    }
    public static void divide(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        merge(arr,start,mid,end);


    }
    public static void main(String[] args ){
        int[] arr= {1,6,3,8,2,9,3,9,6,4};
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
            
        }
    }
    
}
