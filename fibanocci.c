#include <stdio.h>

int main()
{
    int n,i,t1=0,t2=1,nextTerm;
    printf("Enter a limit: ");
    scanf("%d",&n);
    
    printf("The Fibonacci series is: ");
    for(i=1;i<=n;i++)
    {
        printf("%d \n",t1);
        nextTerm = t1+t2;
        t1=t2;
        t2=nextTerm;
    }

    return 0;
}
