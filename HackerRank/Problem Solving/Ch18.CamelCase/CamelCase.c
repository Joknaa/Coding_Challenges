#include <stdio.h>

int camelcase(char *s)
{
    int result = 1;
    for (; *s; s++)
    {
        if ('A' <= *s && *s <= 'Z')
        {
            result++;
        }
    }
    return result;
}

int main(int argc, char const *argv[])
{
    char *s;
    int result;

    scanf("%s", s);

    result = camelcase(s);

    printf("%d", result);

    return 0;
}
