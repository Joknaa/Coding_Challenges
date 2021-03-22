#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *readline();
char **split_string(char *);

// Complete the hurdleRace function below.
int hurdleRace(int k, int height_count, int *height)
{

    int MaxDiff;

    for (int i = 0; i < height_count; i++)
    {
        for (int j = 0; j < height_count; j++)
        {
            if (height[i] > height[j])
            {
                int temp = height[i];
                height[i] = height[j];
                height[j] = temp;
            }
        }
    }

    MaxDiff = height[0] - k;
    int r = MaxDiff > 0 ? MaxDiff : 0;
    return r;
}

int main()
{

    int n, Jump, *height;
    scanf("%d %d", &n, &Jump);

    height = (int *)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &height[i]);
    }

    //int result = hurdleRace(Jump, n, height);

    printf("%d\n", hurdleRace(Jump, n, height));

    return 0;
}
