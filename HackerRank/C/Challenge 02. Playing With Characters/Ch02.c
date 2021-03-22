#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 				
{
    char c;
    char s[50];
    char sen[300];

    scanf("%c", &c);
    printf("%c \n", c);

    scanf("%s", s);
    printf("%s \n", s);
    scanf("\n");

    scanf("%[^\n]%*c", sen);
    printf("%s \n", sen);

    return 0;
}

