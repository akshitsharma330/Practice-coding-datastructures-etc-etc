#include<iostream>
using namespace std;
int main()
{
    int a;
    cout<<endl<<"Enter the the value to be converted";
    cin>>a;
    int dec=0;
    int pow2=1;
    while(a!=0){
        int mod=a%10;
        dec+=mod*pow2;
        a=a/10;
        pow2*=2;
        
    }
    cout<<endl<<"The decimal value is "<<dec;

}