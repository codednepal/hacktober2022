#include <iostream>  
using namespace std;  
int main()  
{  
int x[10][10],y[10][10],mul[10][10],r,c,i,j,k;    
//print the statement
cout<<"enter the number of row=";    
//take input value for n rows
cin>>r;    
cout<<"enter the number of column=";    
cin>>c;    
cout<<"enter the first matrix element=\n";    
//using loops for n matrix elements
for(i=0;i<r;i++)    
{    
for(j=0;j<c;j++)    
{    
cin>>x[i][j];  
}    
}    
//for matrix y
cout<<"enter the second matrix element=\n";    
for(i=0;i<r;i++)    
{    
for(j=0;j<c;j++)    
{    
cin>>y[i][j];    
}    
}    
//multiply matrix x and y
cout<<"multiply of the matrix=\n";    
for(i=0;i<r;i++)    
{    
for(j=0;j<c;j++)    
{    
mul[i][j]=0;    
for(k=0;k<c;k++)    
{    
mul[i][j]+=x[i][k]*y[k][j];    
}    
}    
}    
//for printing result    
for(i=0;i<r;i++)    
{    
for(j=0;j<c;j++)    
{    
cout<<mul[i][j]<<" ";    
}    
cout<<"\n";    
}    
return 0;  
}    
