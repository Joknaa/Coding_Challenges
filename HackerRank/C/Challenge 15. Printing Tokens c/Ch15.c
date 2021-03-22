#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    char *s, *token;
    int StringLength;

    s = malloc(1024 * sizeof(char));

    scanf("%[^\n]", s);

    StringLength = strlen(s) + 1;
    s = realloc(s, StringLength);

    //Write your logic to print the tokens of the sentence here.
    token = strtok(s, " ");

    while (token != NULL)
    {
        printf("%s\n", token);

        token = strtok(NULL, " ");
    }
    return 0;
}