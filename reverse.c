#include <stdio.h>

int main()
{
    int number,remainder,reverseNum=0,copyNum;
    printf("Enter a number: ");
    scanf("%d",&number);
    copyNum=number;

    while (number!=0)
    {
        remainder=number%10;
        reverseNum=reverseNum*10 + remainder;
        number/=10;
    }
   printf("The reverse of %d is %d\n",copyNum,reverseNum);
    
     
    return 0;
}
