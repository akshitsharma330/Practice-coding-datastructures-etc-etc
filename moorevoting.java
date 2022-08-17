public class moorevoting {
    public static void main(String[] args){
        int arr[]={1,5,3,6,2,3,2,3,2,2};
        int aindx=0;
        int count=1;
        for (int i=1;i<arr.length;i++){
            if(arr[i]==arr[aindx]){
                count++;
            }else{
                
                count--;
                if(count==0){
                    aindx=i;
                    count=1; 
                }
            }

        }
        System.out.println(arr[aindx]+" "+count);
    }
    
}
