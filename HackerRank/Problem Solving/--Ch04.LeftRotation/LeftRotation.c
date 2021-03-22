#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int n, b, temp;
    int *myTable;

    scanf("%d %d", &n, &b);

    myTable = (int *)malloc(n * sizeof(int));
    printf("test\n");

    scanf("%d ", myTable[0]);
    scanf("%d ", myTable[1]);
    scanf("%d ", myTable[2]);
    scanf("%d ", myTable[3]);
    printf("\n");
    printf("%d ", myTable[0]);
    printf("%d ", myTable[1]);
    printf("%d ", myTable[2]);
    printf("%d ", myTable[3]);

    /*for (int i = 0; i < n; i++)
    {
        scanf("%d ", myTable[i]);
    }*/

    temp = myTable[0];
    for (int i = 1; i < n; i++)
    {
        myTable[i - 1] = myTable[i];
    }
    myTable[n - 1] = temp;

    for (int i = 0; i < n; i++)
    {
        printf("%d ", myTable[i]);
    }

    return 0;
}
