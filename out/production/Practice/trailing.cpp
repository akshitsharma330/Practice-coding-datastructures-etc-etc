#include<iostream>
using namespace std;
int main()
{
    cout<<"Enter number whose factorial you may want to find our:"<<endl;
    long int n;
    cin>>n;
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    cout<<fact<<endl;
    int trail=0;
    for(int i=5;i<=n;i=i*5)
    {
        trail=trail+(n/i);

    }
    cout<<trail<<endl;


}