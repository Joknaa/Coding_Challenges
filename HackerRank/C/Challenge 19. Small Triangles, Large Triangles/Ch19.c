#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
    int a;
    int b;
    int c;
};

typedef struct triangle triangle;

int TriangeArea(triangle t)
{

    int a, b, c, p;

    a = t.a;
    b = t.b;
    c = t.c;

    return ((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a));
}

void sort_by_area(triangle *tr, int n)
{
    /**
	* Sort an array a of the length n
	*/
    int *S = (int *)malloc(n * sizeof(int));

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (TriangeArea(tr[i]) > TriangeArea(tr[j]))
            {
                triangle temp = tr[i];
                tr[i] = tr[j];
                tr[j] = temp;
            }
        }
    }
}

int main()
{
    int n;
    scanf("%d", &n);
    triangle *tr = malloc(n * sizeof(triangle));
    for (int i = 0; i < n; i++)
    {
        scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
    }
    sort_by_area(tr, n);
    printf("\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
    }
    return 0;
}