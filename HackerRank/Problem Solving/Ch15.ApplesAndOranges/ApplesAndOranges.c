#include <stdio.h>
#include <stdlib.h>


// Complete the countApplesAndOranges function below.
void countApplesAndOranges(int HouseStart, int HouseEnd, int AppleTree, int OrangeTree,
                           int ApplesCount, int *Apples, int OrangesCount, int *Oranges)
{
    int ApplesInside = 0, OrangesInside = 0;
    for (int i = 0; i < ApplesCount; i++)
    {
        Apples[i] += AppleTree;
        if (HouseStart <= Apples[i] && Apples[i] <= HouseEnd)
            ApplesInside++;
    }
    for (int i = 0; i < OrangesCount; i++)
    {
        Oranges[i] += OrangeTree;
        if (HouseStart <= Oranges[i] && Oranges[i] <= HouseEnd)
            OrangesInside++;
    }
    printf("%d\n%d", ApplesInside, OrangesInside);
}

int main()
{

    int HouseStart, HouseEnd, AppleTree, OrangeTree, ApplesCount, OrangesCount;
    int *Apples, *Oranges;
    scanf("%d %d", &HouseStart, &HouseEnd);
    scanf("%d %d", &AppleTree, &OrangeTree);
    scanf("%d %d", &ApplesCount, &OrangesCount);

    Apples = (int *)malloc(ApplesCount * sizeof(int));
    Oranges = (int *)malloc(OrangesCount * sizeof(int));

    for (int i = 0; i < ApplesCount; i++)
    {
        scanf("%d", &Apples[i]);
    }

    for (int i = 0; i < OrangesCount; i++)
    {
        scanf("%d", &Oranges[i]);
    }

    countApplesAndOranges(HouseStart, HouseEnd, AppleTree, OrangeTree, ApplesCount, Apples, OrangesCount, Oranges);

    return 0;
}
