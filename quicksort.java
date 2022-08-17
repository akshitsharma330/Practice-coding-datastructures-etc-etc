public class quicksort {
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int i= start;
        int j= end;
        while(i<=j){
            while(arr[i]<=pivot){
                i++;
            }
            while(j>pivot){
                j++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }


        }
        int temp= arr[j];
        arr[j]=arr[start];
        arr[start]=temp;
        return j;

    }
    public static void sortt(int[] arr, int start, int end){
        if(start<end){
            int pivotIndex=partition(arr, start, end);
            sortt(arr, start, pivotIndex-1);
            sortt(arr, pivotIndex+1, end);

        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,8,2,0,1,6,4,6,8,4};
        sortt(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
