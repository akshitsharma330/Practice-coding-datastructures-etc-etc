
#include<iostream>

#include<vector>
using namespace std;
int main()
{
    // int arr[]={1,2,3,4,5,4,5,6,6,7,8,9,0,9,8,0,66};
    int res=0;
    for(int i=0;i<sizeof(arr)/sizeof(int);i++){
        res=res^arr[i];
        cout<<"firstloop  ";
    }
    int temp=res;
    vector<int> b;
    int iter=1;
    cout<<temp<<endl;
    
    // to find the first right set bit int the first obtained result.
    while(true)
    {
        cout<<"insider while  ";
        if(temp&iter==0)
        {        
            cout<<"insider w if  ";
            break;
        }
        else{
            iter<<1;
            cout<<"insider w else  ";
            
        }
    }
    cout<<iter<<endl;

    return 0;
}