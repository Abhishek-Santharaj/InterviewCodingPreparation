#include <stdio.h>

int main()
{
    int m,n,HCF;
    printf("Enter two numbers: ");
    scanf("%d %d",&m,&n);
    
    for(int i=1;i<=m && i<=n; i++)
    {
        if(m%i==0 && n%i==0)
            HCF=i;
    }
    printf("The HcF of %d and %d = %d \n",m,n,HCF);
    return 0;
}
