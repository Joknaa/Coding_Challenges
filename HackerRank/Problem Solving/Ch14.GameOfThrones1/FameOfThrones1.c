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

char *gameOfThrones(char *s)
{
    printf("test");

    char *Result;
    int *Counts;
    long int ImpairCount = 0, PairCount = 0;

    Counts = (int *)calloc('z' - 'a', sizeof(int));
    Result = (char *)malloc(4 * sizeof(char));

    //* Make the string Lower Case && Count the number of occurrences ..
    printf("test");
    for (long int i = 0; i < strlen(s); i++)
    {
        s[i] = tolower(s[i]);
        Counts[(int)s[i] - 'a']++;
    }

    if (strlen(s) % 2 == 0)
    {
        printf("Is Pair");
        for (int i = 0; i < 'z' - 'a'; i++)
        {
            if (Counts[i] % 2 == 0)
            {
                PairCount++;
            }
        }

        if (PairCount == strlen(s))
        {
            strcpy(Result, "YES");
        }
        else
        {
            strcpy(Result, "NO");
        }
        //Result = PairCount == strlen(s) ? "YES" : "NO";
    }
    else
    {
        printf("Is Impair");
        for (int i = 0; i < 'z' - 'a'; i++)
        {
            if (Counts[i] % 2 == 1)
            {
                ImpairCount++;
            }
        }

        if (ImpairCount == 1)
        {
            strcpy(Result, "YES");
        }
        else
        {
            strcpy(Result, "NO");
        }
        //Result = ImpairCount == 1 ? "YES" : "NO";
    }
    return Result;
}

int main()
{
    FILE *fptr = fopen(getenv("OUTPUT_PATH"), "w");

    char *s = readline();

    char *result = gameOfThrones(s);

    fprintf(fptr, "%s\n", result);

    fclose(fptr);

    return 0;
}

char *readline()
{
    size_t alloc_length = 1024;
    size_t data_length = 0;
    char *data = malloc(alloc_length);

    while (true)
    {
        char *cursor = data + data_length;
        char *line = fgets(cursor, alloc_length - data_length, stdin);

        if (!line)
        {
            break;
        }

        data_length += strlen(cursor);

        if (data_length < alloc_length - 1 || data[data_length - 1] == '\n')
        {
            break;
        }

        size_t new_length = alloc_length << 1;
        data = realloc(data, new_length);

        if (!data)
        {
            break;
        }

        alloc_length = new_length;
    }

    if (data[data_length - 1] == '\n')
    {
        data[data_length - 1] = '\0';
    }

    data = realloc(data, data_length);

    return data;
}
