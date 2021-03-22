#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int SumDigits(int number)
{
    int result = 0, rest;

    do
    {
        rest = number % 10;
        result += rest;
        number = floor(number / 10);
    } 
    while (number >= 10);

     result += number;

    return result;
}

int main()
{

    int n, result;
    printf("Enter a five digit number : ");
    scanf("%d", &n);
    result = SumDigits(n);
    printf("%d", result);
    return 0;
}
