#include<bits/stdc++.h>
using namespace std;

void updateFT(int ft[],int n,int value,int i)
{
    while(i<n)
    {
        ft[i]+=value;
        i+=(i&(-i));
    }
}

int sumattion(int ft[],int n,int i)
{
    int sum=0;
    while(i>0)
    {
        sum=sum+ft[i];
        i=i-(i&(-i));
    }
    return sum;
}
int rangesum(int ft[],int l,int r,int n)
{
    return sumattion(ft,n,r)-sumattion(ft,n,l-1);
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {

        int n;
        cin>>n;
        int arr[n];
        int ft[n+1];
        memset(ft,0,sizeof(ft));
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
            //while taking input creating the fenwick tree////////
            updateFT(ft,n+1,arr[i],i+1);
        }
    }

    return 0;
}
