#include<iostream>
using namespace std;
int main()
{
    int n, i, arr[25], j, temp,flag;
    
    cout<<"Enter the Size (max. 25): ";
    cin>>n;
    cout<<"Enter "<<n<<" Numbers: ";
    for(i=0; i<n; i++)
        cin>>arr[i];
    cout<<"\nSorting Array using Bubble Sort n";
    for(i=0; i<(n-1); i++)
    {
        flag=0;
        
        for(j=0; j<(n-i-1); j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag=1;
            }
        }
