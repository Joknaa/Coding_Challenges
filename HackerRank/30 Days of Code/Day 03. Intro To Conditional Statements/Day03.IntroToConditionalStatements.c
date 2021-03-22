#include <stdio.h>

int main(int argc, char const *argv[])
{
    int n;
    scanf("%d", &n);

    if (n % 2 == 1)
    {
        printf("Weird");
    }
    else
    {
        if (2 <= n && n <= 5)
        {
            printf("Not Weird");
        }
        else if (6 <= n && n <= 20)
        {
            printf("Weird");
        }
        else if (n > 20)
        {
            printf("Not Weird");
        }
    }
    return 0;
}