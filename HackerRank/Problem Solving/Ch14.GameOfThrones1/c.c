#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

findPalind(char *arr)
{
    int l[26] = {0}, i;
    int odd = 0;
    while (*arr != '\0')
    {
        l[*arr - 'a']++;
        arr++;
    }
    for (i = 0; i < 26; i++)
    {
        if (l[i])
            odd++;
    }
    if (odd <= 1)
        printf("YES");
    else
        printf("NO");
    return;
}
int main()
{

    char arr[100001];
    scanf("%s", arr);
    findPalind(arr);
    return 0;
}
