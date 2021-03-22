#include <stdio.h>

typedef struct
{
    int Position;
    int Speed;
} Kangaroo;

char *kangaroo(int x1, int v1, int x2, int v2)
{
    Kangaroo Kangaroo_01, kangaroo_02, First, Last, Fastest, Slowest;
    Kangaroo_01.Position = x1;
    Kangaroo_01.Speed = v1;
    kangaroo_02.Position = x2;
    kangaroo_02.Speed = v2;

    Fastest = Kangaroo_01.Speed >= kangaroo_02.Speed ? Kangaroo_01 : kangaroo_02;
    Slowest = Kangaroo_01.Speed >= kangaroo_02.Speed ? kangaroo_02 : Kangaroo_01;

    First = Kangaroo_01.Position >= kangaroo_02.Position ? Kangaroo_01 : kangaroo_02;
    Last = Kangaroo_01.Position >= kangaroo_02.Position ? kangaroo_02 : Kangaroo_01;

    if (Kangaroo_01.Position == kangaroo_02.Position)
    {
        return "YES";
    }
    if (Fastest.Position > Slowest.Position)
    {
        return "NO";
    }

    for (int i = 0; i < 10000; i++)
    {
        if (Kangaroo_01.Position + Kangaroo_01.Speed * i == kangaroo_02.Position + kangaroo_02.Speed * i)
        {
            return "YES";
        }
    }
    return "NO";
}

int main(int argc, char const *argv[])
{
    int x1, v1, x2, v2;
    char *result;

    scanf("%d %d %d %d", &x1, &v1, &x2, &v2);

    result = kangaroo(x1, v1, x2, v2);
    printf("%s", result);

    return 0;
}
