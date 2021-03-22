#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int sum = 0, n;
    scanf("%d", &n);

    int *table = (int *)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++)
    {
        scanf("%d", table + i);
        sum +=*(table + i);
    }
    printf("%d", sum);

    return 0;
}