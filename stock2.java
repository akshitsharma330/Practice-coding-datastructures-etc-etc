public class stock2 {
    public static void main(String[] args){
        int arr[]={3,1,4,8,7,2,5};
        int maxSoFar=0;
        int aux[]=new int[arr.length];
        aux[0]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>aux[i+1]){
                aux[i]=arr[i];

            }
            else{
                aux[i]=aux[i+1];
            }

        }
        int curr=0;
        for(int i=0;i<arr.length;i++){
            if((aux[i]-arr[i])>maxSoFar){
                maxSoFar=aux[i]-arr[i];
            }
        }
        System.out.println(maxSoFar);
    }
    
}
