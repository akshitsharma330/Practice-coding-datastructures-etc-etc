#include<iostream>
using namespace std;
int main()
{
    int arr[]={5,33,7,2,1,0,6,5,4};
    int n=sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<n;i++)
    {
        int step=i;
        for(int j=i;j<n;j++) {
            if(arr[step]>arr[j])
                step=j; 
            
        }
        int temp=arr[i];
        arr[i]=arr[step];
        arr[step]=temp;
    }
    for(int i: arr){
        cout<<i<<" ";
    }
}