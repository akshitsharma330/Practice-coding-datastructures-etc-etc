#include<iostream>
using namespace std;
int main()
{
    //masking
    int a=6;
    if( (a&1)==1)
    {
        cout<<"odd";
    }
    else
    {
        cout<<"even";
    }
}