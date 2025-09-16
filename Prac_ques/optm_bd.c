#include <stdio.h>

int main() {
    int month[12] = {31,28,31,30,31,30,31,31,30,31,30,31};
    int bdd,bdm,bdy,i,days;
    int tdd = 11;
    int tdm = 8;
    int tdy = 2025;
    int days1 = 0;
    int days2 = 0;
    scanf("%d", &bdd);
    scanf("%d", &bdm);
    scanf("%d", &bdy);

    for(i = 0; i < bdm - 1; i++) {
        days1 = days1+ month[i];
    }
    days1 = days1 + bdd;

    for(i = 0; i < tdm - 1; i++) {
        days2 = days2+ month[i];
    }
    days2 += tdd;

    int total = days1 - days2;

    if(total > 0){
        days = total;
    }
    if(total < 0){
        days = total+ 365;
    }

    printf("Days: %d\n", days);
    return 0;
}