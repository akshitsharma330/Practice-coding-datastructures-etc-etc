#include<iostream>
using namespace std;
int main()
{
    int a=26;
    int mask=1<<2;
    int b=a|mask;
    if(b!=a){
        cout<<"ith element is: 0"<<endl;

    }
    else{
        cout<<"ith element is: 1"<<endl;
    }
}