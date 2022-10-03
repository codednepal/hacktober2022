#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<unistd.h>
#include<netdb.h>

#define NEXT "Hello World of sockets"

int main(int argc, char *argv[]){
    int sock;
struct sockaddr_in server;  
 struct hostent *hp;
    char buffer[1024];

    sock = socket(AF_INET, SOCK_STREAM,0);
    if(sock < 0){
        perror("socket creation failed\n");
        exit(1);
    }
    server.sin_family = AF_INET;
    hp = gethostbyname (argv[1]);
    if(hp == 0){
        perror("hostname not found\n");
        close(sock);
        exit(1);
    }
    memcpy(&server.sin_addr, hp->h_addr, hp->h_length); 
    server.sin_port = htons(5000);

    if(connect(sock, (struct sockaddr *)&server, sizeof(server)) < 0){
        perror("connect failed\n");
        exit(1);
    }
if(send(sock, NEXT, sizeof(NEXT), 0) < 0){
    perror("send failed\n");
                close(sock);
    exit(1);
}
    printf("sent %s\n",NEXT);
    close(sock);
    return 0;

}
