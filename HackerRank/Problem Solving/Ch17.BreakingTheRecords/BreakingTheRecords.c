#include <stdio.h>
#include <stdlib.h>

int *breakingRecords(int *scores, int n)
{
    int *result, Max, Min;
    Max = scores[0];
    Min = scores[0];

    result = (int *)calloc(2, sizeof(int));

    for (int i = 1; i < n; i++)
    {
        if (scores[i] > Max)
        {
            Max = scores[i];
            result[0]++;
        }
        else if (scores[i] < Min)
        {
            Min = scores[i];
            result[1]++;
        }
    }
    return result;
}

int main(int argc, char const *argv[])
{
    int N, *Scores, *Result;

    scanf("%d", &N);

    Result = (int *)malloc(2 * sizeof(int));
    Scores = (int *)malloc(N * sizeof(int));

    for (int i = 0; i < N; i++)
    {
        scanf("%d", &Scores[i]);
    }

    Result = breakingRecords(Scores, N);

    printf("%d %d", Result[0], Result[1]);

    return 0;
}
