#include <stdio.h>
#include <stdlib.h>

int getTotalX(int aSize, int *a, int bSize, int *b)
{
    int **bDivisors;
    int **aDivisors[aSize][100];

    bDivisors = (int **)calloc(bSize, sizeof(int *));

    for (int i = 0; i < bSize; i++)
    {
        bDivisors[i] = (int *)calloc(1, sizeof(int));
        for (int j = 0, h = 0; j < b[i]; j++)
        {
            if (b[i] % j == 0)
            {
                bDivisors[i] = (int *)realloc(bDivisors, (h + 1) * sizeof(int));
                aDivisors[i][h] = j;
                h++;
            }
        }
    }

    for (int i = 0; i < bSize; i++)
    {
        for (int j = 0; j < sizeof(bDivisors[i]) / sizeof(int); j++)
        {
            if (bDivisors[i][j] == bDivisors)
            {
                /* code */
            }
            
        }
    }
}

int main(int argc, char const *argv[])
{
    int aSize, bSize, *a, *b;

    scanf("%d %d", &aSize, &bSize);

    a = (int *)malloc(aSize * sizeof(int));
    b = (int *)malloc(bSize * sizeof(int));

    for (int i = 0; i < aSize; i++)
        scanf("%d", &a[i]);

    for (int i = 0; i < bSize; i++)
        scanf("%d", &b[i]);

    printf("%d", getTotalX(aSize, a, bSize, b));
    return 0;
}
