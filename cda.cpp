#include<iostream>
using namespace std;

int main()
{
    int a=10;
    int b=9;
    a=a^b;
    cout<<a<<" "<<endl;
    b=a^b;
    a=a^b;

    cout<<a<<" "<<b;



}