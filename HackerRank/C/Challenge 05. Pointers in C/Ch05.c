#include <stdio.h>
#include <stdlib.h>

void update(int *a,int *b) {
    int t;
    t = *a;
    *a = *a + *b;
    *b = abs(t - *b);
}   

int main() {
    int a, *pa = &a;
    int b, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);
    return 0;
}

