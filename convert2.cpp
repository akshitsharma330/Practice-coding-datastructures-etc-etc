#include<iostream>
using namespace std;
int main()
{
    // bits to change fro  n&(n-1) bits
    int a= 22;
    int b= 27;
    int c= a^b;
    int iter=0;
    while(c!=0){
        c=c&(c-1);
        iter++; 
        
    }
    cout<<iter<<endl;
}