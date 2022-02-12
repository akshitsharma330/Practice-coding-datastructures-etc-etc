#include<iostream>
using namespace std;
int main()
{
    int a=26;
    int mask=1<<4;
    mask =~mask;
    int b=a&mask;
    
    cout<<b<<endl;
}