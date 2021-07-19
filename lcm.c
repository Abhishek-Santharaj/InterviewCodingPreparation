#include <stdio.h>

int main()
{
    int m,n,LCM;
    printf("Enter a two numbers: ");
    scanf("%d %d",&m,&n);
    
    LCM = (m>n)? m:n;

    while(1)
    {
        if(LCM%m==0 && LCM%n==0)
        {
            printf("LCM of %d and %d is = %d \n",m,n,LCM);
            break;
        }
        LCM++;
    }

    return 0;
}
