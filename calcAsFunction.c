//calcAsFunction

#include<stdio.h>
#include <stdlib.h>


float add(int,int);
float subtract(int,int);

float multiple(int,int);

float divide(int,int);

int main()
{
    int a,b;
    float result;
    char op;

    printf("Enter two numbers :\n");
    scanf("%d %d",&a,&b);

    printf("Enter +, -, *, /: ");
    scanf(" %c",&op);
	
	switch(op)
	{
		case '+' : result = add(a,b); break;
		case '-' : result = subtract(a,b); break;
		case '*' : result = multiple(a,b); break;
		case '/' : result = divide(a,b); break;
			
		default: printf("Invalid"); exit(0);
    }
	printf("The result is %f ",result);
	return 0;
}

float add(int a,int b)
{
return (a+b);
}
float subtract(int a,int b)
{
return (a-b);
}
float multiple(int a,int b)
{
return (a*b);
}
float divide(int a,int b)
{
return (a/b);
}