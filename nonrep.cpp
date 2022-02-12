#include<iostream>
using namespace std;

int main()
{
    int arr[]={1,1,2,2,3,3,4,4,5,5,6,8,7,6,9,8,0,9,0};
    int a=arr[0];
    for(int i=1;i<sizeof(arr)/sizeof(int);i++){
        
        a=a^arr[i];
    }
    cout<<a<<endl;
    return 0;

}