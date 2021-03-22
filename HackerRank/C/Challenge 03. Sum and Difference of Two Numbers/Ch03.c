#include <stdio.h>

int main(){

    int int1, int2;
    float float1, float2;

    printf("enter 2 int numbers: ");
    scanf("%d", &int1);
    scanf("%d", &int2); 

    printf("enter 2 float numbers: ");
    scanf("%f", &float1);
    scanf("%f", &float2);

    int intSum = int1 + int2;
    int intDiff = int1 - int2;
    printf("%d %d \n", intSum, intDiff);

    float floatSum = float1 + float2;
    float floatDiff = float1 - float2;
    printf("%.1f %.1f", floatSum, floatDiff);

}