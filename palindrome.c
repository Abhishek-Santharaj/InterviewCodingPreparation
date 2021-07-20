#include <stdio.h>

int main()
{
    int num,reverseNum = 0,remainder,copyN;
    printf("Enter a number: ");
    scanf("%d",&num);
    copyN = num;

    while(num!=0)
    {
        remainder=num%10;
        reverseNum=reverseNum*10 + remainder;
        num=num/10;
    }
    if(reverseNum == copyN)
        printf("Palindrome");
    else
        printf("Not a Palindrome");
    
    return 0;
}
