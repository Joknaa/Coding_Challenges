#include <stdio.h>
#include <string.h>

int main()
{
    int Hours, Mins, Secs;
    char Format[3];

    scanf("%d:%d:%d%s", &Hours, &Mins, &Secs, Format);

    if (!strcmp(Format, "PM") && Hours != 12)
    {
        Hours += 12;
    }
    if (!strcmp(Format, "AM") && Hours == 12)
    {
        Hours = 0;
    }

    printf("%02d:%02d:%02d", Hours, Mins, Secs);

    return 0;
}
