#include<iostream>
using namespace std;
int main()
{
    int arr[]={5,3,7,2,1,0,6,5,4, 88,69,77,55,33};
    int n=sizeof(arr)/sizeof(arr[0]);
    for (int i=1 ;i<n;i++)

    {   
        int key = arr[i];
        for(int j=i;j>0;j--)
        {
            if(arr[j-1]>key)
            {
                arr[j]=arr[j-1];
                arr[j-1]=key;            
            }          
        }
    }
    for(int i: arr)
        cout<<i<<" ";
}