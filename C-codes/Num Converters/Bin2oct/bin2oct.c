// Convert a binary number to octal number
#include <stdio.h>

int main()
{
    int binaryNumber = 0;
    int octalNumber = 0;
    int i = 1;
    int rem = 0;

    printf("Enter binary number: ");
    scanf("%d", &binaryNumber);

    while (binaryNumber != 0) {
        rem = binaryNumber % 10;
        octalNumber = octalNumber + rem * i;

        i = i * 2;
        binaryNumber = binaryNumber / 10;
    }

    printf("Octal Number: %o", octalNumber);
    return 0;
}