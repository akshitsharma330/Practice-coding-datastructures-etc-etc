#include<iostream>

using namespace std;
int main()
{
    int res=4;
    int n=1;
    while((res&n)==0)
    {
        cout<<"insider while  ";
        n=n<<1;

    }
    
    cout<<n<<endl;
}