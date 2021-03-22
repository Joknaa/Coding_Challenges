#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

    // Declare second integer, double, and String variables.
    int myInt;
    double myDouble;
    char myString[200];

    // Read and save an integer, double, and String to your variables.
    scanf("%d", &myInt);
    scanf("%lf", &myDouble);
    scanf("\n");
    scanf("%[^\n]%*c", myString);

    // Print the sum of both integer variables on a new line.
    printf("%d\n", i + myInt);

    // Print the sum of the double variables on a new line.
    printf("%.1f\n", d + myDouble);

    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    printf("%s%s\n", s, myString);

    return 0;
}