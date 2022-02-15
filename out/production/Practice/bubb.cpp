#include<iostream>
using namespace std;

int main()
{
    int arr[]={5,3,7,2,1,0,6,5,4};
    
    int iter=sizeof(arr)/sizeof(arr[0]);
    while(iter>1)
    {   
        cout<<"ouuter while"<<endl;
        int i=0;
        while(i<iter-1){
            cout<<"inwhile"<<endl;
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                
                cout<<"if";
            }
            i++;

        }
        iter--;
    }
    for( int a: arr)
        cout<<a<<" ";
    cout<<endl;

}