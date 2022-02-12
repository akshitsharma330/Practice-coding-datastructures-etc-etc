#include<iostream>
using namespace std;
int main()
{
    int a=26;
    int mask = 1<<2;
    int b=a|mask;
    cout<<b<<endl;
}