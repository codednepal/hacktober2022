#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>

int main(int agrc,char *argv[]){

    /*variables*/
    int sock;
    struct sockaddr_in server;
    int mysock;
    char buffer[1024];
    int rval;
    /*Create shocket*/
    /*tcp--ip*/
sock = socket(AF_INET, SOCK_STREAM,0);
    if(sock == 0){
        printf("socket creation failed\n");
        exit(1);
    }
server.sin_family = AF_INET;
server.sin_addr.s_addr = INADDR_ANY;
server.sin_port = htons(5000);

    /*call bind*/
    if(bind(sock, (struct sockaddr *)&server, sizeof(server))<0){
        perror("bind failed\n");
        exit(1);
    }

    /*listen*/
    listen(sock, 5);
    //
 //printf("listening\n");
    // }

    /*accept*/
    /*Only only connectection doesnt need to optimized or creating 
    another process for handeling is not required*/
do{
    mysock = accept(sock, (struct sockaddr *) 0, 0);
    if(mysock  == -1 ){
        perror("accept failed\n");
    }
    else{
        memset(buffer, 0, sizeof(buffer));

        if((rval=recv(mysock,buffer,sizeof(buffer),0))<0)
            perror("Reading steam message error");
            else if(rval == 0)
                printf("Client disconnected\n");
            
            else
                printf("Message received: %s\n",buffer);
            printf("Got the message(rval = %d) \n",rval);
            close(mysock);
              
    }
} while(1);


    return 0;
}