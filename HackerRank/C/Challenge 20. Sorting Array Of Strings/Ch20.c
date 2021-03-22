#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int lexicographic_sort(const char *, const char *);
int lexicographic_sort_reverse(const char *, const char *);
int sort_by_number_of_distinct_characters(const char *, const char *);
int sort_by_length(const char *, const char *);
void string_sort(char **, const int, int (*cmp_func)(const char *a, const char *b));
int Number_Of_Distinct_Characters(const char *);

//*-------------------------------------------------------> main
int main()
{
    system("cls");
    int n;
    scanf("%d", &n);

    char **arr;
    arr = (char **)malloc(n * sizeof(char *));

    for (int i = 0; i < n; i++)
    {
        *(arr + i) = malloc(1024 * sizeof(char));
        scanf("%s", *(arr + i));
        *(arr + i) = realloc(*(arr + i), strlen(*(arr + i)) + 1);
    }

    string_sort(arr, n, lexicographic_sort);
    for (int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, lexicographic_sort_reverse);
    for (int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, sort_by_length);
    for (int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, sort_by_number_of_distinct_characters);
    for (int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");
}

//*-------------------------------------------------------> Number_Of_Distinct_Characters
int Number_Of_Distinct_Characters(const char *a)
{
    int *Counter = (int *)calloc(26, sizeof(int));
    int Count = 0;

    for (int i = 0; i < strlen(a); i++)
    {
        if (!Counter[a[i] - 'a'])
        {
            Counter[a[i] - 'a']++;
            Count++;
        }
    }
    free(Counter);
    return Count;
}

//*-------------------------------------------------------> lexicographic_sort
int lexicographic_sort(const char *a, const char *b)
{
    return strcmp(a, b);
}

//*-------------------------------------------------------> lexicographic_sort_reverse
int lexicographic_sort_reverse(const char *a, const char *b)
{
    return strcmp(b, a);
}

//*-------------------------------------------------------> sort_by_number_of_distinct_characters
int sort_by_number_of_distinct_characters(const char *a, const char *b)
{
    int CountA_B = Number_Of_Distinct_Characters(a) - Number_Of_Distinct_Characters(b);
    return CountA_B ? CountA_B : lexicographic_sort(a, b);
}

//*-------------------------------------------------------> sort_by_length
int sort_by_length(const char *a, const char *b)
{
    int LengthA_B = strlen(a) - strlen(b);
    return LengthA_B ? LengthA_B : lexicographic_sort(a, b);
}

//*-------------------------------------------------------> string_sort
void string_sort(char **arr, const int len, int (*cmp_func)(const char *a, const char *b))
{
    int Con = 0;
    while (!Con)
    {
        Con = 1;
        for (int i = 0; i < len - 1; i++)
        {
            if (cmp_func(arr[i], arr[i + 1]) > 0)
            {
                char *temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                Con = 0;
            }
        }
    }
}


