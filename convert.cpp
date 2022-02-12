#include<iostream>
using namespace std;
int main()
{
    //bits to chnage a to b
    int a= 22;
    int b= 27;
    int c= a^b;
    int iter=0;
    while(c!=0)
    { 
        if ((c&1)==1)
        {
            
            iter++; //
            c=c>>1;          
        }
        else
        {
            
            c=c>>1;
        }
    }
    cout<<iter<<endl;

}