#include<stdio.h>
#include<stdlib.h>
#include<string.h>


    void insert_binary(char *str,char d){
        int len = strlen(str);
        static pos = 0;
        if(pos == 4){
memmove(&str[1],str,len+1);
        str[0] = ' ';
        pos = 0;
    }
        
        memmove(&str[1],str,len+1);
        str[0] = d;
        pos++;
    }
int main(int argc,char *agrv[]){
    int i;
    char binary[1024];
    int n,r;
    
    if(argc<2){
        fprintf(stderr,"usages:%s number\n",agrv[0]);
        exit(0);
    }
    memset(binary,0,sizeof(binary));
    i = atoi(agrv[1]);
    do{
        r = i%2;
        n = i/2;
        /*insert degiit reminder to the leftmost*/
        insert_binary(binary,r?'1':'0');
        i = n;
    }while(i);
printf("binayr : %s\n",binary);
    
    return 0;
}