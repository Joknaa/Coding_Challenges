#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    int t;
    int n, sum = 0;

    scanf("%d", &t);

    for (int i = 0; i < t; i++)
    {
        scanf("%d", &n);

        for (int i = 0; i < n; i++)
        {
            if (i % 3 == 0)
            {
                sum += i;
            }
            else if (i % 5 == 0)
            {
                sum += i;
            }
        }

        printf("%d\n", sum);
    }
    return 0;
}
