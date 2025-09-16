//to find the difference of days between today and users given birthday
#include <stdio.h>

int main(){
    int arr[24] = {31,28,31,30,31,30,31,31,30,31,30,31,31,28,31,30,31,30,31,31,30,31,30,31};
    int bdd,bdm,bdy,tdd,tdm,tdy,month,i,date;
    scanf("%d",&bdd);
    scanf("%d",&bdm);
    scanf("%d",&bdy);
    tdd = 11;
    tdm = 8;
    tdy = 2025;
    int monthm = bdm - tdm;
    if(monthm >= 0){
        int sum1 = 0;
        for(i = bdm; i<=tdm ; i--){
            sum1 = sum1 + arr[i-1];
            printf("%d",sum1);
        }
        printf("%d\n",sum1);
        month = sum1;
    }
    else{
        int sum = 0;
        for(i = (12+tdm); i<=bdm ; i--){
            sum = sum + arr[i-1];
        }
        printf("%d\n",sum);
        month = sum;
    }
    int dateb = bdd - tdd;
    if(dateb >=0){
        date = bdd - tdd;
        printf("%d\n",date);
    }
    else{
        date = (bdd + arr[bdm-1] ) - tdd;
        printf("%d\n",date);
    }

    int result = month + date;
    printf("%d\n",result); 
    return 0;
}
