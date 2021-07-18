#include <stdio.h>

int main()
{
    int number,count=0,copyNum;
    printf("Enter a number: ");
    scanf("%d",&number);
    copyNum=number;

    while (number!=0)
    {
        number/=10;
        count++;
    }
   printf("The number of digits in %d is %d\n",copyNum,count);
    
     
    return 0;
}
