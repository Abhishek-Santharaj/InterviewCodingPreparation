#include<stdio.h>

int main()
{
    int a,b;
    float result;
    char op;

    printf("Enter two numbers :\n");
    scanf("%d %d",&a,&b);

    printf("Enter +, -, *, /: ");
    scanf(" %c",&op);

    if(op == '+')
        result=a+b;
    else if(op == '-')
        result=a-b;
    else if (op == '*')
        result=a*b;
    else if(op == '/')
        result=a/b;
    else
        printf("INVALID");        

    printf("The result is %f\n",result);


    return 0;
}