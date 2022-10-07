#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc,char *argv[]){
    char h[17]="0123456789ABCDEF";
    int num;
    char hex[1024];
    int quo;
    int rem;
    int i;

    if (argc !=2){
        fprintf(stderr,"Usage: %s decimal_number\n",argv[0]);
        exit(1);
    }
    num = atoi(argv[1]);
    hex[0] = '\0';

    while(num != 0){
        quo = num / 16;
        rem = num % 16;
        memmove(&hex[1],hex,strlen(hex)+1);
        hex[0] = h[rem];
        num = quo;
    }
    printf("%d= 0x%s\n\n",atoi(argv[1]),hex);
    return 0;
}