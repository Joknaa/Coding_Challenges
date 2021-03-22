#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void calculate_the_maximum(int n, int k)
{
    int table[n - 1], andMax = 0, orMax = 0, xorMax = 0;

    for (int i = 0; i < n; i++)
    {
        table[i] = i + 1;
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            int andValue = table[i] & table[j];
            int orValue = table[i] | table[j];
            int xorValue = table[i] ^ table[j];

            if (andValue > andMax && andValue < k)
                andMax = andValue;

            if (orValue > orMax && orValue < k)
                orMax = orValue;

            if (xorValue > xorMax && xorValue < k)
                xorMax = xorValue;
        }
    }
    printf("%d \n%d \n%d", andMax, orMax, xorMax);
}

int main()
{
    int n, k;

    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);

    return 0;
}
