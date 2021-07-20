#include <stdio.h>

int main()
{
    int number,lastdigit,copyNum,sum=0;
    printf("Enter a number: ");
    scanf("%d",&number);
    copyNum=number;

    while (number!=0)
    {
        lastdigit=number%10;
        sum = sum+lastdigit;
        number/=10;
    }
   printf("The sum of digits in %d is %d\n",copyNum,sum);
    
     
    return 0;
}
