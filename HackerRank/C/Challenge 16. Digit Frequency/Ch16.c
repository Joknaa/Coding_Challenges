#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char *string;
    int freq0 = 0, freq1 = 0, freq2 = 0, freq3 = 0, freq4 = 0;
    int freq5 = 0, freq6 = 0, freq7 = 0, freq8 = 0, freq9 = 0;

    string = (char *)malloc(1000 * sizeof(char));
    scanf("%[^\n]", string);

    for (int i = 0; i < strlen(string) + 1; i++)
    {
        switch (string[i])
        {
        case '0':
            freq0++;
            break;
        case '1':
            freq1++;
            break;
        case '2':
            freq2++;
            break;
        case '3':
            freq3++;
            break;
        case '4':
            freq4++;
            break;
        case '5':
            freq5++;
            break;
        case '6':
            freq6++;
            break;
        case '7':
            freq7++;
            break;
        case '8':
            freq8++;
            break;
        case '9':
            freq9++;
            break;
        }
    }

    printf("%d %d %d %d %d ", freq0, freq1, freq2, freq3, freq4);
    printf("%d %d %d %d %d ", freq5, freq6, freq7, freq8, freq9);

    return 0;
}
