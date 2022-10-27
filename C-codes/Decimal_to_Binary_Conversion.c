// Decimal to Binary Conversion

#include<stdio.h>
int main()
{int num,i,j,arr[10];
printf("Enter the number : ");
scanf("%d",&num);
for(i=0;num!=0;i++)
{
arr[i]=num%2;
num=num/2;
}
for(j=i-1;j>=0;j--)
{printf("%d",arr[j]);
}
return 0;
}
